import java.util.*;
public class qudrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x axix number");
        float x=sc.nextFloat();
        System.out.println("Enter y axix number");
        float y=sc.nextFloat();

        if(x>0 && y>0){
            System.out.println(x+" and"+y +"are in first Qudrant");
        }else if(x<0 && y>0){
            System.out.println(x+" and"+y +"are in second Qudrant");

        }else if(x<0 && y<0){
            System.out.println(x+" and"+y +"are in third Qudrant");
        }else{
            System.out.println(x+" and"+y +"are in fourth Qudrant");
        }


        
    }
    
}
