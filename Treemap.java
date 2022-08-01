/*
TreeMap:
Features:
elements are in sorted and not in duplicates

ex: medical store
 */


import java.util.Map;
import java.util.TreeMap;

public class Treemap {

    public static void main(String [] args){
        Map<String,Integer>  stocks=new TreeMap<String,Integer>();

        stocks.put("Dolo",13);
        stocks.put("Coldrub",16);
        stocks.put("Action cold",20);
        stocks.put("Mentho",40);

        for (Map.Entry<String, Integer> entry : stocks.entrySet())
            System.out.println(
                    "[" + entry.getKey()
                            + ", " + entry.getValue() + "]");


    }
}
