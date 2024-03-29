package assignment1;
import java.util.Scanner;

public class Main {

                    //main runner class for all the programs in assignment 1.
                    // Just run this program to access all different problems (except 2 as it uses command line args)

    public static void main(String[] args) {
        System.out.println("assignment 1 all problems : ");
        Scanner sc = new Scanner(System.in);
        int choice=1;
        do{
            System.out.println("\n enter the number of the problem to view or 0 to exit : ");
            choice = sc.nextInt();
            switch(choice){
                case 1: Problem_1.shortSum();break;
                case 3: Problem_3.heightConverter();break;
                case 4: Problem_4.AreaOfCircle();break;
                case 5: Problem_5.eqCheck();break;
                case 6: Problem_6.overloadingUse();break;
                case 7: Problem_7.checkMethods();break;
                case 8: Problem_8.checkMethods();break;
                case 9: Problem_9.checkMethods();break;
                case 10: Problem_10.metricConversion();break;
                case 11: Problem_11.demo();break;
                case 0:
                    System.out.println("exiting program. byee.."); break;
                default:
                    System.out.println("invalid choice please select a valid problem number");break;

            }
        }while(choice!=0);
    }
}
