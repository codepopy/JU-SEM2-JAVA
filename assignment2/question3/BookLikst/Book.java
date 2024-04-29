package assignment2.question3.BookLikst;

public class Book {
    private int bookId;
    private String title;
    private int totalCopiesPurchased;
    private int copiesAvailable;

    // Constructor
    public Book(int bookId, String title, int totalCopiesPurchased, int copiesAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.totalCopiesPurchased = totalCopiesPurchased;
        this.copiesAvailable = copiesAvailable;
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalCopiesPurchased() {
        return totalCopiesPurchased;
    }

    public void setTotalCopiesPurchased(int totalCopiesPurchased) {
        this.totalCopiesPurchased = totalCopiesPurchased;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Total Copies Purchased: " + totalCopiesPurchased);
        System.out.println("Copies Available: " + copiesAvailable);
    }

}
