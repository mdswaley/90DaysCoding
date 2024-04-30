package Function;

public class FunOverloading {
    private static int sum(int a,int b){
        return a+b;
    }
    private static int sum(int a,int b,int c){
            return a+b+c;
    }
    private static float sum(float a,float b){
        return a+b;
    }
    
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 3;

        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
        System.out.println(sum(2.1f, 3.2f));
    }
}


