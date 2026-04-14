import java.util.*;
public class decitobin {
    public static int decitobin(int num){
        int result=0;
        int pow=0;
        while(num>0){
            int rem=num%2;
            result=result+(rem*(int)Math.pow(10,pow));
            pow++;
            num/=2;

        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        System.out.println(decitobin(num));
        
    }
    
}
