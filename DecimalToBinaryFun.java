package Function;

public class DecimalToBinaryFun {
    public static int DecToBin(int n){
        int pow = 0;
        int binNum = 0;
        while (n>0) {
            int rem = n%2;
            binNum = binNum + rem * (int)Math.pow(10, pow);
            pow++;
            n = n/2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        System.out.println(DecToBin(9));
    }
}
