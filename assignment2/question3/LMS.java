package assignment2.question3;

import assignment2.question3.BookLikst.Book;
import assignment2.question3.BookLikst.BookListDB;
import assignment2.question3.MemberList.Member;
import assignment2.question3.MemberList.MemberService;
import assignment2.question3.Transaction.TransactionList;

import java.util.Date;
import java.util.Scanner;

public class LMS {
    public static void main(String[] args) {
        BookListDB books = new BookListDB();
        MemberService members = new MemberService();
        TransactionList transactions = new TransactionList();

        books.addBook(new Book(101,"thus Spoke Zarathustra",5,20));
        books.addBook(new Book(102, "Crime and Punishment", 8, 15));
        books.addBook(new Book(103, "The Great Gatsby", 2, 12));
        books.addBook(new Book(104, "To Kill a Mockingbird", 1, 10));
        books.addBook(new Book(105, "1984", 10, 9));
        books.addBook(new Book(106, "Pride and Prejudice", 21, 8));

        members.addMember(new Member(21,"will wheaton", "2002/5/20)",0));
        members.addMember(new Member(22,"joe goldberg", "2001/8/25",0));
        members.addMember(new Member(23,"ellie alvez", "1995/10/11",0));
        members.addMember(new Member(24,"havana perks", "1999/11/28",0));

        LibraryImpl lm = new LibraryImpl(books,members,transactions);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. View All Books");
            System.out.println("4. Add Member");
            System.out.println("5. Search Member");
            System.out.println("6. View All Members");
            System.out.println("7. Issue Book");
            System.out.println("8. Return Book");

            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("\nenter book details");
                    System.out.print("book id : ");
                    int bookId = scanner.nextInt();
                    System.out.print("book Name : ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    System.out.print("total copies purchased : ");
                    int tc = scanner.nextInt();
                    System.out.println("available copies : ");
                    int ac = scanner.nextInt();
                    books.addBook(new Book(bookId,bookName,tc,ac));
                    break;
                case 2:
                    // Search Book
                    System.out.println("\nenter the id to search : ");
                    int sId = scanner.nextInt();
                    lm.showBookById(sId);
                    break;
                case 3:
                    // View All Books
                    lm.showAllBooks();
                    break;
                case 4:
                    // Add Member
                    System.out.print("member id : ");
                    int memId = scanner.nextInt();
                    System.out.print("member name : ");
                    String mname = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("enter dob : ");
                    String dt = scanner.nextLine();
                    scanner.nextLine();
                    members.addMember(new Member(memId,mname,dt,0));
                    break;
                case 5:
                    // Search Member
                    System.out.println("enter member id to search : ");
                    int id = scanner.nextInt();
                    lm.showMemberById(id);
                    break;
                case 6:
                    // View All Members
                    lm.showAllMembers();
                    break;
                case 7:
                    // Issue Book
                    System.out.println("enter member Id : ");
                    int memIs = scanner.nextInt();
                    System.out.println("enter book Id");
                    int bokd = scanner.nextInt();
                    lm.issueBook(memIs,bokd);
                    break;
                case 8:
                    // Return Book
                    System.out.println("enter member Id : ");
                    int m = scanner.nextInt();
                    System.out.println("enter book Id");
                    int b = scanner.nextInt();
                    lm.returnBook(m,b);
                    break;

                case 9:
                    lm.showAllIssues();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice!=0);
    }
}
