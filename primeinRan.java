import java.util.Scanner;

public class primeinRan {
    public static boolean isPrime(int n){
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
    
    public static int primeInRan(int n){
        for(int i=2;i<=n;i++){
           if( isPrime(i)){
            System.out.print(i+" " );
           }
        }
        System.out.println( );
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int n=sc.nextInt();
        primeInRan(n);


    }
    
}
