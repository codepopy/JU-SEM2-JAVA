package assignment1;

import java.util.Scanner;

public class Problem_3 {
    public static void heightConverter(){
        System.out.println("enter your height in centimeters : ");
        Scanner sc = new Scanner(System.in);
        int heightInCm = sc.nextInt();
        double inches = heightInCm/2.54;
        double foot = heightInCm/30.5;
        System.out.println("your height in inches is "+inches+" and in inches is "+foot);

    }
}
