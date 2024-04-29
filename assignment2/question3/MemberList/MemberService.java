package assignment2.question3.MemberList;

import assignment2.question3.BookLikst.Book;
import assignment2.question3.BookLikst.BookListDB;
import assignment2.question3.Transaction.Transaction;

import java.util.HashMap;

public class MemberService {

    private Member[] members;
    private int memberCount;
    private final HashMap<Integer,Member> memberIdIndex;

   public MemberService(){
       members = new Member[100];
       memberIdIndex = new HashMap<Integer,Member>();
       memberCount = 0;
   }

   public boolean addMember(Member m){
       if(memberCount==100 || memberIdIndex.containsKey(m.getMemberId()))return false;
       members[memberCount] = m;
       memberIdIndex.put(m.getMemberId(),members[memberCount]);
       memberCount++;
       return true;
   }
   public void showAllMembers(){
       for (int i=0;i<memberCount;i++){
           members[i].displayMemberInfo();
           System.out.println("-------------------------------------------");
       }
       System.out.println(" ");
   }
   public void showMemberById(int id){
       if(memberIdIndex.containsKey(id)) {
           Member m = memberIdIndex.get(id);
           m.displayMemberInfo();
           System.out.println("--------------------------------------------");
       }else{
           System.out.println("member not found!");
       }
   }
    public boolean issue(int id){
            Member found = memberIdIndex.get(id);
            if(found.getBooksIssued()==5)return false;
            found.setBooksIssued(found.getBooksIssued()+1);
            return true;
    }
    public void returned(int id){
        Member found = memberIdIndex.get(id);
        found.setBooksIssued(found.getBooksIssued()-1);
    }

   public boolean ifMemberExists(int id){
       return memberIdIndex.containsKey(id);
   }


}
