/*
Arraylist:
features:  duplicate elements allowed and not in sorted order

ex: library registry
 */

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args){
        ArrayList<String> names=new ArrayList<>();

        names.add("book 1");
        names.add("book 2");
        names.add("book 3");
        names.add("book 2");


        for(String name: names){
            System.out.println(name);

        }
    }
}
