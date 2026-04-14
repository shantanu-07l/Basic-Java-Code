import java.util.*;
public class ForLoops{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a which table");
        
        int table=sc.nextInt();
         for(int i=0;i<=10;i++){
            System.out.println(table+"*"+i+"="+table*i);
        }

    }
}