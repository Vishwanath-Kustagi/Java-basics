public class Calculator {

    int mult(int a, int b){
        return a*b;
    }
    int mul(int a, int b,int c){
        return a*b*c;
    }
    public static void main(String [] args){
        Calculator cal=new Calculator();

        int a=10;
        int b=20;
        int c=3;
        int diff=b-a;
        System.out.println("sum="+(a+b));
        System.out.println("diff="+(b-a));
        System.out.println("product = "+cal.mul(a,b,c));
        System.out.println("prod="+cal.mult(a,b));

    }
}
