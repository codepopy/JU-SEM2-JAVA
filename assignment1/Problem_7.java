package assignment1;

import java.util.Scanner;

public class Problem_7 {
    public static void checkMethods(){
        Scanner sc = new Scanner(System.in);
        System.out.println("making new student object using setter methods: ");
        Student s = new Student();
        System.out.print("enter name : ");
        s.setName(sc.nextLine());
        System.out.print("enter roll : ");
        s.setRoll( sc.nextInt());
        System.out.print("enter score : ");
        s.setScore( sc.nextInt());

        System.out.println("\n the student object created is : ");
        s.display();

        System.out.println("\n copying the prev student into a new student object... ");
        Student s2 = new Student();
        s2.copy(s);
        System.out.println("displaying the 2nd copied object : ");
        s2.display();

    }
}
