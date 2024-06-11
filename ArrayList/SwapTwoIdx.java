package ArrayList;

import java.util.ArrayList;

public class SwapTwoIdx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(2);
        System.out.println("orignal ArrayList: "+list);
        int ele1=list.get(1);
        int ele2 = list.get(2);

        // list.set(2,ele2);
        // list.set(3, ele1);
        // System.out.println(list);
        //or

        int temp = ele1;
        list.set(1, ele2);
        list.set(2, temp);
        System.out.println("After Swap: "+list);
    }
}
