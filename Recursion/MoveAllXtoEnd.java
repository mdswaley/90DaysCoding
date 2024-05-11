package Recursion;

public class MoveAllXtoEnd {
    public static void printArrRes(String str,int idx,String newString,int count){
        if (idx == str.length()) {
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == 'x') {
            count++;
            printArrRes(str, idx+1, newString, count);
        }else{
            newString += curr;
            printArrRes(str, idx+1, newString, count);
        }


    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        
        printArrRes(str, 0, "", 0);

    }
}
