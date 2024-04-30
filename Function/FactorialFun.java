package Function;

public class FactorialFun {
    public static int factOfNum(int a){
        int fact=1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int factAnotherWay(int n){
        int fact=1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }
    public static int binomialCoefficent(int n,int r){
        int nFact = factAnotherWay(n);
        int rFact = factAnotherWay(r);
        int nmrFact = factAnotherWay(n-r);

        int bc = nFact/(rFact*nmrFact);

        return bc;

    }
    public static void main(String[] args) {
        int a = 3;
        System.out.println(factOfNum(a));
        System.out.println(factAnotherWay(5));
        System.out.println("Binomial Coefficent : "+binomialCoefficent(5, 2));
        
    }
}
