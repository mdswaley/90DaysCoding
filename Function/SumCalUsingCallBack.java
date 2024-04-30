package Function;

import java.util.Scanner;

interface Callback {
    void onResult(int result);
}
public class SumCalUsingCallBack {
    public static void printSum(int a, int b, Callback callback) {
        int res = a + b;
        callback.onResult(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Callback callback = new Callback() {
            @Override
            public void onResult(int result) {
                System.out.println("Sum: " + result);
            }
        };

        printSum(a, b, callback);
    }
}
