package assignment2.question3;

import assignment2.question3.BookLikst.Book;
import assignment2.question3.BookLikst.BookListDB;
import assignment2.question3.MemberList.Member;

public interface Library {
     public void addBook(Book book);
     public void showBookById(int id);
     public void showAllBooks();
     public void addMember(Member m);
     public void showMemberById(int id);
     public void showAllMembers();
     public void issueBook(int memberId, int bookId);
     public void returnBook(int memberId, int bookId);
}
