package assignment1;

import java.util.Scanner;

public class Problem_4 {
    public static final double PI = 3.14;

    public static void AreaOfCircle(){
        System.out.print("enter the radius of the cirle : ");
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double area = PI* rad* rad;
        System.out.println("the area of the circle is : "+area);
    }
}
