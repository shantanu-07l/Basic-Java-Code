import java.util.*;
public class Whilenatural {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a  number");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            i++;
            
            
        }
        System.out.println("sum of "+n+"is"+sum);
        
        

        
    }
    
}
