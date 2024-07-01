package Stack;

import java.util.Stack;

public class MaxHistogram {
    public static int calArea(int[] arr){
        int maxval = 0;
        
        int[] nsr = new int[arr.length];
        
        int[] nsl = new int[arr.length];

        // find next samller in right 
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // find next samller in left
         s = new Stack<>();
        for (int i = 0; i <arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // find current area:- width = (j-i-1)  = nsr[i]-nsl[i]-1

        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height * width;
            
            maxval = Math.max(maxval, currArea);
        }

        return maxval;


    }
    public static void main(String[] args) {
        int[] arr =  {2,1,5,6,2,3};

        System.out.println(calArea(arr));
        
    }
}
