package assignment1;

import java.util.Scanner;

public class Problem_11 {

    public static void demo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter details to create an instructor : ");
        System.out.print("enter name of the instructor");
        String ins_name = sc.nextLine();
        System.out.print("enter the phone number : ");
        String ins_phn = sc.nextLine();
        Instructor instructor = new Instructor(ins_name,ins_phn);
        System.out.println("instructor : \n"+instructor);


        System.out.println("please enter details to create a textbook : ");
        System.out.print("enter title of the book : ");
        String bk_title = sc.nextLine();
        System.out.print("enter author of the book : ");
        String bk_auth = sc.nextLine();
        System.out.print("enter publisher of the book : ");
        String bk_pub = sc.nextLine();
        TextBook tx = new TextBook(bk_title,bk_auth,bk_pub);
        System.out.println("Textbook : \n"+tx);

        System.out.println("enter course name to create course with above instructor and textbook : ");
        String co_name = sc.nextLine();
        Course c = new Course(co_name, instructor,tx);
        System.out.println("course : \n"+c);





    }

}
