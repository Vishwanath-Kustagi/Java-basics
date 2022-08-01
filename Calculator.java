public class Calculator {


    int mul(int a, int b){
        return a*b;
    }
    public static void main(String [] args){
        Calculator cal=new Calculator();

        int a=10;
        int b=20;
        int diff=b-a;
        System.out.println("sum="+(a+b));
        System.out.println("diff="+(b-a));
        System.out.println("product="+cal.mul(a,b));

    }
}
