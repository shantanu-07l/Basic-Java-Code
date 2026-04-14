import java.util.*;
public class Function3 {
    public static int factorial(int n){
        int fac=1;
        for(int i=n;i>=1;i--){
            fac*=i;
            
        }
        System.out.println("factorial of"+n+"="+fac);
        return n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        factorial(n);
    }
}
