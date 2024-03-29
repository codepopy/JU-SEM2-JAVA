package assignment1;

import java.util.Scanner;

public class Problem_5 {
    public static void eqCheck(){
        System.out.println("enter a string : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = a;
        System.out.println("the outcome of first equality check for assigning one string to another is a==b -> "+(a==b)+" and a.equals(b) -> "+b.equals(a));
        System.out.println("enter 2 strings for second test  ");
        System.out.print("enter String a : ");
        String x = sc.nextLine();
        System.out.print("enter String b : ");
        String y = sc.nextLine();
        System.out.println("the outcome of first equality check for assigning one string to another is a==b -> "+(x==y)+" and a.equals(b) -> "+x.equals(y));

    }
}
