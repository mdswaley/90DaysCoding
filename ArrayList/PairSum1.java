package ArrayList;

import java.util.ArrayList;


// Only for sorted arraylist pointer approch is work.


public class PairSum1 {
    public static boolean pairSum1Brt(ArrayList<Integer> list,int target){
        //Brute force approch
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size()-1; j++) {
                if (list.get(i)+list.get(j)==target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean PairSum1Pointer(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp) {
            if (list.get(lp)+list.get(rp)==target) {
                return true;
            }else if (list.get(lp)+list.get(rp)<target) {
                lp++;
            }else{
                rp--;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        int target = 5;
        // System.out.println(pairSum1Brt(list,target));
        System.out.println(PairSum1Pointer(list, target));

    }
}
