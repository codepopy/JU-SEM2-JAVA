package assignment2.question3;

import assignment2.question3.BookLikst.Book;
import assignment2.question3.BookLikst.BookListDB;
import assignment2.question3.MemberList.Member;
import assignment2.question3.MemberList.MemberService;
import assignment2.question3.Transaction.Transaction;
import assignment2.question3.Transaction.TransactionList;

public class LibraryImpl implements Library {

    private BookListDB books;
    private MemberService members;
    private TransactionList transactions;

    public LibraryImpl(BookListDB books, MemberService members, TransactionList transactions) {
        this.books = books;
        this.members = members;
        this.transactions = transactions;
    }

    @Override
    public void addBook(Book book) {
        if(books.addBook(book)){
            System.out.println("new book is added to the list");
        }else {
            System.out.println("book could not be added try again");
        }
    }

    @Override
    public void showBookById(int id) {
        Book bk = books.showBookById(id);
        if(bk!=null){
            bk.displayBookInfo();
        }else{
            System.out.println("no book with given id found");
        }
    }

    @Override
    public void showAllBooks() {
        books.ListAllBooks();
    }

    @Override
    public void addMember(Member m) {
        if(members.addMember(m)){
            System.out.println("new member successfully added!\n");
        }else{
            System.out.println("member couldn't be added!\n");
        }
    }

    @Override
    public void showMemberById(int id) {
        members.showMemberById(id);
    }

    @Override
    public void showAllMembers() {
        members.showAllMembers();
    }

    @Override
    public void issueBook(int memberId, int bookId) {
        if(!books.ifBookExists(bookId) || !members.ifMemberExists(memberId)){
            System.out.println("no such member or book found try again");
        }else{
            if(books.issue(bookId) && members.issue(memberId) && transactions.addTransaction(new Transaction(memberId,bookId))){

                System.out.println("book issued!\n\n");
            }else{
                System.out.println("error!");
            }
        }
    }

    @Override
    public void returnBook(int memberId, int bookId) {
        if(transactions.removeTransaction(memberId,bookId)){
            books.returned(bookId);
            members.returned(memberId);
            System.out.println("book successfully returned..\n");
        }else{
            System.out.println("no such records found!\n");
        }

    }
    public void showAllIssues(){
        transactions.showAllTransactions();
    }

}
