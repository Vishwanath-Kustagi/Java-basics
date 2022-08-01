/*
Inheritance: process of acquiring properties from parent class to child class(parent child relationship)

we make use of extends keyword
 */



class Animal {
    void food(){
        System.out.println("eats grass");
    }
}

class Tiger extends Animal{
    void food(){
        System.out.println("eats deer!!");
    }
}

public class Override {

    public static void main(String [] args){

       Animal an=new Animal();
       Tiger t=new Tiger();
       Animal anm=new Tiger();
       an.food();
       t.food();
       anm.food();
    }
}
