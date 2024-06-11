package ArrayList;

import java.util.ArrayList;

public class ReverseAArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 2);
        list.add(1, 6);
        list.add(2, 5);
        list.add(3, 1);

        //TC:-O(n)
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
