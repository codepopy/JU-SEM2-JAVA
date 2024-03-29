package assignment1;

import java.util.Scanner;

public class Problem_8 {
    public static void checkMethods(){
        Scanner sc = new Scanner(System.in);
        System.out.println("making new student object constructors: ");
        Student onlyRollStudent = new Student();
        Student rollNameStudent = new Student();
        Student s = new Student();

        System.out.println("creating student obj with only roll : ");
        System.out.print("enter roll : ");
        onlyRollStudent.setRoll( sc.nextInt());

        sc.nextLine();
        System.out.println("creating student obj with roll + name :");
        System.out.print("enter name : ");
        rollNameStudent.setName(sc.nextLine());
        System.out.print("enter roll : ");
        rollNameStudent.setRoll( sc.nextInt());

        sc.nextLine();
        System.out.println("creating student obj with roll name and score :");
        System.out.print("enter name : ");
        s.setName(sc.nextLine());
        System.out.print("enter roll : ");
        s.setRoll( sc.nextInt());
        System.out.print("enter score : ");
        s.setScore( sc.nextInt());

        System.out.println("\n the student objects created are : ");
        onlyRollStudent.display();
        rollNameStudent.display();
        s.display();

        System.out.println("\n creating copy of 3rd student with copy constructor... ");
        Student s2 = new Student(s);
        System.out.println("displaying the copied object : ");
        s2.display();

    }
}
