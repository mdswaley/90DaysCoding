package ArrayList.Que;

import java.util.ArrayList;
import java.util.Collections;


public class Monotonic {
    /*
     * An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.AnArraylistnumsismonotoneincreasingifforalli<=j,nums.get(i)<=nums.get(j).AnArraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise
     */
    public static boolean printMonotic(ArrayList<Integer> list){
        // Tc:-O(n)
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)<list.get(i+1)) {
                inc = false;
            }else if(list.get(i)>list.get(i+1)){
                dec = false;
            }

        }
        return inc || dec;
        
    }
    public static boolean printMonoUsingColl(ArrayList<Integer> list){
        // TC :- O(n logn)
        ArrayList<Integer> inc = new ArrayList<>(list);
        ArrayList<Integer> dec = new ArrayList<>(list);

        Collections.sort(inc);
        Collections.sort(dec,Collections.reverseOrder());

        return list.equals(inc) || list.equals(dec);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        // list.add(2);
        list.add(3);
        list.add(2);


        // list.add(1);
        // list.add(2);
        // list.add(2);
        // list.add(3);

        // System.out.println(printMonotic(list));

        System.out.println(printMonoUsingColl(list));
        

    }
}
