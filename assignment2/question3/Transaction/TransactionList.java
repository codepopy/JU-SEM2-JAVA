package assignment2.question3.Transaction;

import assignment2.question3.MemberList.Member;

import java.util.HashMap;

public class TransactionList {
    private Transaction[] transactions;
    private  final HashMap<Integer, Transaction> transactionIndex;
    private int transactionCount;
    public TransactionList() {
        transactions = new Transaction[100];
        transactionIndex = new HashMap<Integer, Transaction>();
        transactionCount = 0;
    }
    public boolean addTransaction(Transaction t){
        if(transactionCount==100)return false;
        transactions[transactionCount] = t;
        transactionIndex.put(cantorPair(t.getBookId(),t.getMemberID()), transactions[transactionCount]);
        transactionCount++;
        return true;
    }
    public boolean removeTransaction(int memberId, int bookId){
        int unq = cantorPair(bookId,memberId);
        if(transactionIndex.containsKey(unq)){
            Transaction t = transactionIndex.get(unq);
            t.setMemberID(0);
            return true;
        }
        return false;
    }
    public boolean ifTransactionExists(int memberId, int bookId){
        int unq = cantorPair(bookId,memberId);
        return transactionIndex.containsKey(unq);
    }

    public int cantorPair(int a, int b){
        int res = (a+b) * (a + b + 1) / 2 + a;
        return res;
    }

    public void showAllTransactions(){
        if(transactionCount==0){
            System.out.println("no records yet");
        }else {
            for (int i = 0; i < transactionCount; i++) {
                System.out.println("member id : " + transactions[i].getMemberID());
                System.out.println("book id : " + transactions[i].getBookId());
                System.out.println("------------------------------------------------------");
            }
        }
    }

}
