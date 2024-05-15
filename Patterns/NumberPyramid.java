package Patterns;

public class NumberPyramid {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            //spc
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            //number->print row number times
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
           System.out.println();
        }
    }
}
