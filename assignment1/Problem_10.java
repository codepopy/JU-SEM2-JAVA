package assignment1;

import java.util.Scanner;

public class Problem_10 {
   public static void metricConversion(){
       System.out.println("enter 1 to convert kilometer to mile and 2 for mile to kilometer : ");
       Scanner sc = new Scanner(System.in);
       Metric m = new Metric();
       int choice = sc.nextInt();
       if(choice==1){
           System.out.print("enter distance in kilometer : ");
           double dis = sc.nextDouble();
           System.out.print("distance in mile is : "+m.convertToMile(dis));
       }
       else{
           System.out.print("enter distance in miles : ");
           double dis = sc.nextDouble();
           System.out.print("distance in kilometer is : "+m.convertToKilometer(dis));
       }
   }
}
