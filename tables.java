import java.util.*;
public class tables{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("Table of "+num+"is");
        for(int i=1;i<=10;i++){
            System.out.println(num*i);

        }
        
    }
}