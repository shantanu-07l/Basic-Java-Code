import java.util.*;
public class binarytodeci {
    public static int binToDec(int num){
        int pow=0;
        int result=0;
        while(num>0){
            int lastdig=num%10;
            result=(int) (result+Math.pow(2, pow)*lastdig);
            num=num/10;
            pow++;
        }

        return result;
    }

    
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(binToDec(n));

    }
    
}
