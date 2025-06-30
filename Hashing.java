import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(2);
        hs.add(1);
        hs.add(null);
        hs.add(4);
        hs.add(2);

        System.out.println(hs);
        if(hs.contains(2)){
            System.out.println("HashSet contains key 2");
        }
    }
}
