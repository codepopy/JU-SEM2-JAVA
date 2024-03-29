package assignment1;

public class TextBook {
    private String title;
    private String authorName;
    private String publisher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public TextBook(String title, String authorName, String publisher) {
        this.title = title;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
