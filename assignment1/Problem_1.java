package assignment1;

import java.util.Scanner;

public class Problem_1 {
    public static void shortSum() {
        System.out.println("please enter 2 short integers : ");
        Scanner sc = new Scanner(System.in);
        short a,b;
        a = sc.nextShort();
        b = sc.nextShort();
        System.out.println("the sum : "+a+" + "+b+" = "+ (a+b));
    }
}
