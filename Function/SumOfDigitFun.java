package Function;

public class SumOfDigitFun {
    public static int countDigit(int n){
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Approach this question in the following way:
        // a.Take a variable sum = 0
        // b.Find the last digit of the number
        // c.Add it to the sum
        // d.Repeat a & b until the number becomes 0 

        int n = 20011;

        System.out.println(countDigit(n));
    }
}
