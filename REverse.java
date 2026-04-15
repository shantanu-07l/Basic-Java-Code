public class REverse {
    public static void main(String[] args){

        int a=2;
        int b=4;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+"b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"b="+b);

    }
    
}
