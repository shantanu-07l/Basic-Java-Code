import java.util.*;
public class function {

    public static int evenOdd(int n){
        if(n%2==0){
            System.out.println(n+"is Even number");
        }else{
            System.out.println(n+"is odd number");
        }
        return n;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        evenOdd(n);

    }
    
}
