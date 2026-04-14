public class buterflypat {
    public static void main(String[] args) {
        int n=4;
        // first half
        for(int i=1;i<=n;i++){
            //star 1
            for(int j=1;j<=i;j++){//print in term of i
                System.out.print("*");
            }
            //for space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star 2
            for(int j=1;j<=i;j++){//print in term of i
                System.out.print("*");
            }
            System.out.println();
        }
        // secound half
        for(int i=n;i>=1;i--){//i is decreses
            //star 1
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star 2
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
