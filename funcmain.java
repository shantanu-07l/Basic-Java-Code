import java.util.*;
public class funcmain{
    public static int multi(int a,int b){
        int multiply=a*b;
        
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number");
        int num1=sc.nextInt();
        System.out.println("Enter a second number");
        int num2=sc.nextInt();
        int prod=multi(num1,num2);
        System.out.println(prod);
        prod=multi(10,45);
        System.out.println(prod);

    }
}