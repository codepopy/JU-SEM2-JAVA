package assignment2.question3.Transaction;

import assignment2.question3.BookLikst.Book;
import assignment2.question3.MemberList.Member;

public class Transaction {
   private int memberID;
   private int bookId;

    public Transaction(int memberID, int bookId) {
        this.memberID = memberID;
        this.bookId = bookId;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
