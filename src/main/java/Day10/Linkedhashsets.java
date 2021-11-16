package Day10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashsets {

    public static void main(String[] args) {

        Set<String> al = new LinkedHashSet<String>();

//        al.add(345);
        al.add("US");
        al.add("INDIA");
        al.add("RUSSIA");
        al.add("CHINA");
        al.add("INDIA");
        al.add("UK");

//        System.out.println(al.get(0));

        //        Itr -> Iterator
        Iterator<String> iter = al.iterator();
        while (iter.hasNext()) {
            String country = iter.next();
            System.out.println("Country is :" + country);
        }


    }
}
