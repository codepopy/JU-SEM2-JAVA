package assignment2.question3.BookLikst;

import java.util.HashMap;
import java.util.List;

public class BookListDB {
    private Book[] ListOfBooks;
    private int bookCount;
    private final HashMap<Integer,Book>BookIdIndex;
    public BookListDB(){
        ListOfBooks = new Book[100];
        BookIdIndex = new HashMap<Integer, Book>();
        bookCount = 0;
    }

    public boolean addBook(Book inp) {
        if(bookCount==100 || BookIdIndex.containsKey(inp.getBookId()))return false;
        else{
            ListOfBooks[bookCount] = inp;
            BookIdIndex.put(inp.getBookId(),ListOfBooks[bookCount]);
            bookCount++;
        }
        return true;
    }

    public Book addCopies(int id, int copies){
        Book found = null;
        if(BookIdIndex.containsKey(id)){
             found = BookIdIndex.get(id);
            found.setCopiesAvailable(found.getCopiesAvailable()+copies);
        }
        return found;
    }
    public boolean issue(int id){
            Book found = BookIdIndex.get(id);
            if(found.getCopiesAvailable()==0)return false;
            found.setCopiesAvailable(found.getCopiesAvailable()-1);
            found.setTotalCopiesPurchased(found.getTotalCopiesPurchased()+1);
            return true;
    }

    public void returned(int id){
        Book found = BookIdIndex.get(id);
        found.setCopiesAvailable(found.getCopiesAvailable()+1);
        found.setTotalCopiesPurchased(found.getTotalCopiesPurchased()-1);
    }

    public void ListAllBooks(){
        if(bookCount==0) {
            System.out.println("the BookList is empty...\n");
            return;
        }
        for(int i=0; i<bookCount;i++){
            ListOfBooks[i].displayBookInfo();
            System.out.println("------------------------------------------------");
        }

    }
    public Book showBookById(int id){
        Book rs = null;
        if(BookIdIndex.containsKey(id)){
           rs =  BookIdIndex.get(id);
        }
        return rs;
    }

    public boolean ifBookExists(int id){
        return BookIdIndex.containsKey(id);
    }

}
