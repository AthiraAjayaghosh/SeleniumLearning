package Day10;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {


    public static void main(String[] args) {

        List<String> al = new LinkedList<String>();
//        al.add(345);
        al.add("US");
        al.add("INDIA");
        al.add("RUSSIA");
        al.add("CHINA");
        al.add("UK");

        System.out.println(al.get(0));

        //        Itr -> Iterator
        Iterator<String> iter = al.iterator();
        while (iter.hasNext()) {
            String country = iter.next();
            System.out.println("Country is :" + country);
        }
    }
}
