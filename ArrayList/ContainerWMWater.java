package ArrayList;

import java.util.ArrayList;

public class ContainerWMWater {
    public static int MaxWater(ArrayList<Integer> list){
        // in there TC:-O(n^2)
        // initialy maximum water is 0. 
        int maxWtr = 0;
        //brute force
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                // height is minimum of 1st element and next element
                int ht = Math.min(list.get(i), list.get(j));
                //for finding width is substract last elem index with current elem index.
                int width = j - i;
                // then mutiplay and find current water
                int currWater = ht * width;
                // after all element if max water is more then print max else current water.
                maxWtr = Math.max(maxWtr, currWater);
            }
        }
        return maxWtr;
    }
    public static int MaxWaterOn(ArrayList<Integer> list){
        // in there TC:-O(n) 
        //approch or logic
        int maxWtr = 0;
        int lp = 0;
        int rp=list.size()-1;
        while (lp<rp) {
            int ht = Math.min(list.get(lp), list.get(rp));//height
            int width = rp - lp;
            int currWtr = ht * width;
            maxWtr = Math.max(maxWtr, currWtr);

            //update our pointer
            if (list.get(lp)<list.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }
        return maxWtr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);


        // int ans = MaxWater(list);
        // System.out.println(ans);

        int ans2 = MaxWaterOn(list);
        System.out.println(ans2);
    }
}
