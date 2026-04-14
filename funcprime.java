import java.util.*;
public class funcprime {
    public static boolean prime(int n){
        if(n<=1){
            System.out.print("not prime nor composite");
        }
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){//condition  i<n; i<=n-1;i*i<=n;
            if(n%i==0){
                isPrime=false;
            }
        }

        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(prime(n));
        
    }
    
}
