package ArrayList.Que;

import java.util.ArrayList;

public class LonelyNums {
    public static void printLonely(ArrayList<Integer> org){
        
        ArrayList<Integer> lonelyNums = new ArrayList<>(org);
        
        for (int i = 0; i < lonelyNums.size(); i++) {
            int num = lonelyNums.get(i);
            if (org.contains(num + 1) || org.contains(num - 1)) {
                lonelyNums.remove(i);
                i--; // decrementing i because we removed an element
            }
        }
        
        System.out.println(lonelyNums);
    }
    public static void main(String[] args) {
        ArrayList<Integer> org = new ArrayList<>();
        // org.add(1);
        // org.add(2);
        // org.add(5);
        // org.add(3);


        org.add(1);
        org.add(3);
        org.add(5);
        org.add(3);


        printLonely(org);


    }
}
