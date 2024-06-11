package ArrayList;

import java.util.ArrayList;

public class MaxInAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(2);
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for(int i=0;i<list.size();i++){
            if (list.get(i)>max) {
                max = list.get(i);
                //or
                // max = Math.max(max, list.get(i));
            }
        }
        System.out.println(max);
    }
}
