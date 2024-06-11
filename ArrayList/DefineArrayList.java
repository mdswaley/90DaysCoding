package ArrayList;

import java.util.ArrayList;

public class DefineArrayList {
    public static void main(String[] args) {
        //Integer,String,Float etc are class in java and it is not primitive datatype.
        //ArrayList is a in build data Structure in java.
        //we are not scrach no write code .
        ArrayList<Integer> list = new ArrayList<>();

        //add in list
        list.add(1); //tc:- O(1) constant time
        list.add(2);
        list.add(3);
        list .add(4);
        //another way to add list
        list.add(1, 10);
        System.out.println(list);//[1, 10, 2, 3, 4]


        //get Intext of element
        int ele = list.get(2);//tc:-O(1) constant time
        System.out.println(ele);// 2
        

        //remove element place in index
        int elerem = list.remove(1);//tc:-O(n) bcz it going every index the find element and delete.
        System.out.println(elerem);// 10
        System.out.println(list);//[1, 2, 3, 4] 


        //set element in any place of list
        list.set(2, 5);// tc:-O(n) bcz it going that index then set new value at that index
        System.out.println(list);//[1, 2, 5, 4]


        //contains if element is contain in list o/p true else false
        //tc:-O(n) check is contain or not in every index in list
        System.out.println(list.contains(5));//true
        System.out.println(list.contains(11));//false


        //size() :- it is same as length property in array but in AL it is a method.
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        } 
        System.out.println();

    }
}
