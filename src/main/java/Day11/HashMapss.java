package Day11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapss {
    public static void main(String[] args) {

        Map<String, String> hmap = new HashMap<String, String>();

        hmap.put("US","Washington");
        hmap.put("China","Beijing");
        hmap.put("Russia","Moscow");
        hmap.put("India","Delhi");
        hmap.put("US","Chicago");


        System.out.println(hmap.get("Russia"));

//        iterator
        Iterator<String> iter = hmap.keySet().iterator();
        while(iter.hasNext()){

            String key = iter.next();
            String value= hmap.get(key);
            System.out.println("Key is: " + key + " and Value is  : " + value);
        }

    }
}
