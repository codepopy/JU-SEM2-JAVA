package assignment1;

public class Course {
    private String CourseName;
    private Instructor instructor;
    private TextBook textBook;

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public TextBook getTextBook() {
        return textBook;
    }

    public void setTextBook(TextBook textBook) {
        this.textBook = textBook;
    }

    public Course(String courseName, Instructor instructor, TextBook textBook) {
        CourseName = courseName;
        this.instructor = instructor;
        this.textBook = textBook;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseName='" + CourseName + '\'' +
                ", instructor=" + instructor +
                ", textBook=" + textBook +
                '}';
    }
}
