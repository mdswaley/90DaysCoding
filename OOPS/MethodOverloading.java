package OOPS;

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2, 4));
        System.out.println(cal.sum(2.3f,4.1f));
        System.out.println(cal.sum(5,2,1));


    }
}


