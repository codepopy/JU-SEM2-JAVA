package assignment1;

public class Problem_6 {
    public static void show(int a){
        System.out.println("the parameter is : "+a);
    }
    public static void show(double a){
        System.out.println("the parameter is : "+a);
    }
    public static void overloadingUse(){
        System.out.println(" when the functions are overloaded they work else they don't : ");
        show(12);
        show(12.4);
    }


}
