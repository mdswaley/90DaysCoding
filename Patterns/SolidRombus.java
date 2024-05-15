package Patterns;

public class SolidRombus {
    public static void main(String args[]){
        int n=5;

        //outer loop
        for(int i=1;i<=n;i++){
        //space
        for(int sp=1;sp<=n-i;sp++){
           
            System.out.print(" ");
           
        }
        //star
        for(int j=1;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
