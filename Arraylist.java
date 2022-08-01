/*
Arraylist:
features:  duplicate elements allowed and not in sorted order

ex: library registry
 */

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("book 1");
        names.add("book 2");
        names.add("book 3");
        names.add("book 2");
        names.add("book 5");
        names.add("book 6");
        names.add("book 7");
        names.add("book 9");
        names.add("book 10");
        names.add("book 11");

        System.out.println("Books in the library are as follows:");
        for (String name : names) {
            System.out.println(name);

        }
    }
}
