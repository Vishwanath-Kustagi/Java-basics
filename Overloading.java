/*
Polymorphism:  ability to create multiple forms
two types:
1. Overloading : two or more methods have same  name but differs in Number or type of parameters

2. Overriding  : two or more methods have same name but differs in implementations(In parent child relationship).
 */



public class Overloading {

    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args){
       Overloading ol=new Overloading();

       System.out.println("sum:"+ol.add(19,1));
       System.out.println("sum:"+ol.add(10,20,30));
    }
}
