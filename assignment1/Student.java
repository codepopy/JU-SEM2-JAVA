package assignment1;

public class Student {
    private String name;
    private int roll;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void display() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", score=" + score +
                '}');
    }
    public void copy(Student s){
        setName(s.getName());
        setRoll(s.getRoll());
        setScore(s.getScore());
    }

    public Student() {

    }
    public Student(int roll) {
        this.roll = roll;
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public Student(String name, int roll, int score) {
        this.name = name;
        this.roll = roll;
        this.score = score;
    }
    public Student(Student s){
        setRoll(s.getRoll());
        setName(s.getName());
        setScore(s.getScore());
    }
}
