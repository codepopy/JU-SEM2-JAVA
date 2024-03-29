package assignment1;

import java.util.Scanner;

public class Problem_9 {

    public static void checkMethods(){
        System.out.println("creating bank accounts : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter account number : ");
        int ac_no = sc.nextInt();

        System.out.println("enter balance  : ");
        double bal = sc.nextDouble();

        Accounts ac = new Accounts(ac_no,bal);

        System.out.println("the interest rate is : "+ac.getInterestRate());
        System.out.println("the balance is : "+ac.getBalance());
        System.out.println("the amount of interest is : "+ac.calculateInterest());

        System.out.println("enter new interest rate to change the interest of this account : ");
        ac.setInterestRate(sc.nextDouble());
        System.out.println("the amount of interest now is : "+ac.calculateInterest());

    }

}
