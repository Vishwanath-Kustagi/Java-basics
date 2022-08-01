/*
LinkedHashSet:
features:
duplicates not allowed and not in sorted order

ex: shop bills
 */


import java.util.LinkedHashSet;

public class Linkedhashset {

    public static void main(String [] args){

        LinkedHashSet<String> items=new LinkedHashSet<>();

        items.add("Sugar");
        items.add("Dal");
        items.add("Rice");
        items.add("Biscuits");


        for (String item: items) {
            System.out.println(item);
        }
    }
}
