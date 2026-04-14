import java.util.*;
public class Function5 {
    public static int average(int a,int b,int c){
        int avg=(a+b+c)/2;
        System.out.println("Average of number is"+avg);
        return avg;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number");
        int a=sc.nextInt();
        System.out.println("enter a secoundnumber");
        int b=sc.nextInt();
        System.out.println("enter a third number");
        int c=sc.nextInt();
        average(a,b,c);
    }
    
}
