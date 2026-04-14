import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1...Additon");
        System.out.println("2...Subtractin");
        System.out.println("3...Multiplication");
        System.out.println("4...divison");
        System.out.println("5...Modulu");
        System.out.println("enter your choice");
        int n=sc.nextInt();
        System.out.println("Enter first number");
        float a=sc.nextInt();
        System.out.println("Enter secound number");
        float b= sc.nextInt();

        switch(n){
            case 1:float sum=a+b;
                   System.out.println(sum);
                   break;
            case 2:System.out.println(a-b);
                   break;
            case 3:System.out.println(a*b);
                   break;
            case 4:
                   if(b==0){
                            System.out.println("Please enter correct number");
                   }else{
                            System.out.println(a/b);
                   }
                   break;
            case 5: 
                   if(b==0){
                     System.out.println("please enter a correct number");

                   }else{
                     System.out.println(a%b);
                     
                   }
                   break;
            default :System.out.println("Invaild choice");
                     System.out.println("please enter write choice");

                     
        }

    }
}
