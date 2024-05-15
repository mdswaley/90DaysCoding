package Patterns;

public class Betterflyptn {
    public static void main(String args[]){
        int n=5;
        //upper half
        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
             for(int sp=1;sp<=2*(n-i);sp++){
                    System.out.print(" ");
                }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=0;i--){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int sp=1;sp<=2*(n-i);sp++){
                    System.out.print(" ");
                }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
    
        }

    }
}
