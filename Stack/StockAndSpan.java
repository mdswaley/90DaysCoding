package Stack;

import java.util.Stack;

public class StockAndSpan {
    public static void stockspan(int stock[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]=1;//for 100 span is 1
        s.push(0); // stack is now 0 for 100
        for (int i = 1; i < stock.length; i++) { //after 0 we start iterate from 1 index 
            int currPrice = stock[i];//currpr is current day stock
            while (!s.isEmpty() && currPrice > stock[s.peek()]) { //while loop for where ever currentPrice is find more than that stock
                s.pop();//pop until stack is not empty and currpr is greater prev price
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]= i - s.peek();
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stock[] = {100,110,60,70,60,85,100}; //this stocks of 7 days
        int span[] = new int[stock.length]; // we store index into new array span[7]

        stockspan(stock,span);//call function 

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }
}
