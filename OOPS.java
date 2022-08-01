/*
as java Is Object oriented programming lang, everything should be inside class

Class: it is a blueprint from which objects are created or it is a group of objects Ex: Vehicles

Objects: it is instance of class or real world entity. ex: Car
 */


public class OOPS {

    int sum(int a ,int b){
        return a+b;
    }
    public static void main(String [] args){
        //System.out.println("hey you are going good");
        OOPS oops= new OOPS();/* Object creation*/
        System.out.print("sum="+oops.sum(10,20));
    }
}
