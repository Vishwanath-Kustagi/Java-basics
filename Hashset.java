/*
HashSet:
features:
not allowed duplicates and not in sorted order
ex: course enrollment
 */

import java.util.HashSet;

public class Hashset {
    public static void main(String [] args){
        HashSet<String> enrollments=new HashSet<>();

        enrollments.add("Sudhir");
        enrollments.add("Sarthak");
        enrollments.add("Tilak");
        enrollments.add("Geeta");


        for (String enroll: enrollments) {
            System.out.println(enroll);
        }
    }
}
