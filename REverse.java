public class REverse {
    public static void main(String[] args){

        int a=2;
        int b=4;
        int temp=a;//temp=2
        a=b;//a=4
        b=temp;//b=2
        System.out.println("a="+a+"b="+b);
        // without temp
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"b="+b);

    }
    
}
