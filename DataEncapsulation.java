/*
Data Encapsulation: process of combining data members and member function into a single unit called class

 we use setters and getters to achieve data encapsulation
 */

class demo{
    private String name;
    private int age=20;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class DataEncapsulation {

    public static void main(String [] args){

        demo d=new demo();

        d.setName("Vijay");
        d.setAge(20);


        System.out.println(d.getName()+" is "+d.getAge()+" years old");


    }
}
