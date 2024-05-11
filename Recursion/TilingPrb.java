package Recursion;

public class TilingPrb {
    public static int tilingPrb(int n){
        //2x0 or 2x1 only one tile placed
        if(n == 0 || n == 1){
            return 1;
        }

        //for vertical place tile
        int fnm1 = tilingPrb(n-1);

        //for horizontal place tile
        int fnm2 = tilingPrb(n-2);
        //total way to file our place or floor.
        int totWay = fnm1 + fnm2;

        return totWay;

        // return tilingPrb(n-1) + tilingPrb(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingPrb(4));
    }
}
