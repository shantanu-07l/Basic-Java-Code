import java.util.*;
public class Function2 {
    public static int Add(int a,int b){
        int sum=a+b;
        System.out.println("sum ="+sum);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a first number");
        int a=sc.nextInt();
        System.out.println("Enter a secound number");
        int b=sc.nextInt();

        Add(a,b);

    }    
}
