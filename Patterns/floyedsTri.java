package Patterns;

public class floyedsTri {
    public static void main(String args[]){
        int n=6;
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" "+num+" ");
                num++;
            }
            System.out.println();
        }
    }
    
}
