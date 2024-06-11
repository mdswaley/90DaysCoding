package ArrayList;

import java.util.ArrayList;

// Find if any pair in a Sorted & Rotated ArrayList has a target sum.

public class PairSum2 {
    public static boolean printRoatedSortedAL(ArrayList<Integer> list,int tar){
        int bp=-1;//braking point is invalid index.
        int n = list.size();
        for (int i = 0; i < n ; i++) {
            if (list.get(i)>list.get(i+1)) {
                bp=i;
                break;
            }
        }
        int lp = bp;
        int rp = bp+1;
        while (lp!=rp) {
            if (list.get(lp)+list.get(rp)==tar) {
                return true;
            }else if (list.get(lp)+list.get(rp) > tar) {
                lp=(n+lp-1) % n;
            }else{
                
                rp=(rp+1) % n;
            }
        }
        return false;
        

    }
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int tar = 16;
    System.out.println(printRoatedSortedAL(list, tar));

    }
    
}
