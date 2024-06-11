package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(9);
        //Collections is class in java which sort the element by default in asecnding order.
        Collections.sort(list);
        System.out.println(list);
        //You want to list is in desending order
        //second parameter is determine what logic you want it is a function in java called as comparator.
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        

    }
}
