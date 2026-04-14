import java.util.*;
public class Compare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter secound number");
        int b=sc.nextInt();

        if(a==b){
            System.out.println("both number are same");
        }

        else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is Greter than a");
        }

    }
}
