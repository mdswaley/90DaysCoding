package Patterns;

public class invertedHalfPrm {
    public static void main(String args[]){
        int n=0;
        int m=5;
        for(int i=m;i>=n;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //inverted half pytamid 180d roted
        // int n=4;
       
        // for(int i=0;i<n;i++){
        //     //inner loop for space
        //     for(int j=0;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //inner loop for star
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        //inverted half pyramid using number
        // int n=0;
        // for(int i=4;i>=0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
            
         
        
    }
}
