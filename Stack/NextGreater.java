package Stack;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        // find next grater in right side
        int[] arr = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int[] nextGrt = new int[arr.length];

        for (int i = arr.length-1 ; i >= 0; i--) { // tc:- O(n)
            // while 
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }

            // if else
            if (s.isEmpty()) {
                nextGrt[i] = -1;
            }else{
                nextGrt[i] = arr[s.peek()];
            }

            // push element

            s.push(i);
            
        }

        for (int j = 0; j < nextGrt.length; j++) {
            System.out.print(nextGrt[j]+" ");
        }
        

    }
}

// similar type que
// 1) find next greater in left side ?
//     Approch:- only reverse the i loop like traverse from 0 to length-1.
// 2) find next smaller in right side?
//     Approch:- only change in while loop arr[s.peek()]>=arr[i] bcz we pop all largest element
// 3) find next smaller in left side?
//     Approch:- change both loops 1st for loop traverse from 0 to length and while loop this arr[s.peek()]>=arr[i].