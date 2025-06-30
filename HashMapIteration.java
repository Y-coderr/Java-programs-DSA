import java.util.*;

public class HashMapIteration {

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China", 120);
        hm.put("Germany",160);
 
        Set<String> key = hm.keySet();
        System.out.println(key);

        for (String k : key) {
            System.out.println("Key = "+k+", Value ="+hm.get(k));
        }
    }
    
}
