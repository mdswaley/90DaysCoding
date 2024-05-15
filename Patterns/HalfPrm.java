package Patterns;

public class HalfPrm {
    public static void main(String args[]){
        int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //    System.out.println();
        // }

        //Half pyramid with number
        //outer loop-->for row
            for(int i=1;i<=n;i++){
                //inner loop-->for column
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    
        
    }
}
