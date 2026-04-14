import java.util.*;
public class Whileloops {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a which table ");
        int n=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        }
    }
}
