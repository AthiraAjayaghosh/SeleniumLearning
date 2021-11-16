package Day10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<String> al = new ArrayList<String>();
//        al.add(345);
        al.add("US");
        al.add("INDIA");
        al.add("RUSSIA");
        al.add("CHINA");
        al.add("INDIA");
        al.add("UK");

        al.add(2, "Nepal");
        System.out.println(al.contains("CHINA"));

        System.out.println(al.get(0));

//        Itr -> Iterator
        Iterator<String> iter = al.iterator();
        while (iter.hasNext()) {
            String country = iter.next();
            System.out.println("Country is :" + country);
        }
    }

}