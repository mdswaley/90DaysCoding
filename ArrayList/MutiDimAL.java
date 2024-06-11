package ArrayList;

import java.util.ArrayList;

public class MutiDimAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);

        // ArrayList<Integer> arr2 = new ArrayList<>();
        // arr2.add(1*2);
        // arr2.add(2*2);
        // arr2.add(3*2);
        // arr2.add(4*2);
        // arr2.add(5*2);

        // ArrayList<Integer> arr3 = new ArrayList<>();
        // arr3.add(1*3);
        // arr3.add(2*3);
        // arr3.add(3*3);
        // arr3.add(4*3);
        // arr3.add(5*3);
        // main.add(arr);
        // main.add(arr2);
        // main.add(arr3);
        // System.out.println(main);

        //for printing the main list 
        // for(int i=0;i<main.size();i++){
        //     ArrayList<Integer> currList = main.get(i);
        //     System.out.println(currList);
        // }


        //or
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for(int i=1;i<6;i++){
            arr.add(i*1);
            arr2.add(i*2);
            arr3.add(i*3);
        }
        main.add(arr);
        main.add(arr2);
        main.add(arr3);
        System.out.println(main);

        for (int i = 0; i < main.size(); i++) {
            ArrayList<Integer> curr = main.get(i);
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();

        }


    }
}
