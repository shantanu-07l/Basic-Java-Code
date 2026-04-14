import java.util.*;
public class Function4 {
    public static int primeOrNot(int n){
        if(n<=1){
            System.out.println(n+" is not prime nor composite");
        }
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println(n+"is not prime");
                return n;
                
            }
           
        
        
        }
        System.out.println(n+"is prime number");

        return n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        primeOrNot(n);

    }
    
}
