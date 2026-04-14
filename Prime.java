import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n<=1){
            System.out.println(n+"is not prime not composite");
        }else{
            boolean isPrime=true;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }

            }
            if(isPrime==true){
                System.out.print(n+"is prime number");
            }else{
                System.out.println(n+"is not prime number");
            }
        }

        

        
        
    }
    
}
