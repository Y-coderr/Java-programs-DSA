import java.util.*;

abstract class YashFunc{
    abstract void name();
    abstract void prn();
}



public class AbstractionJava extends YashFunc{
    public class HashMapImpl{

    HashMap<Integer,Integer> hm = new HashMap();

    }
    @Override
    void name() {
        System.out.println("Yash Kadam");
    }
     
    @Override
    void prn(){
        System.out.println("RBTL23IT142");
    }

    public static void main(String[] args) {
        YashFunc obj = new AbstractionJava();
        obj.name();
        obj.prn();
    }
}
