// reversing the original number
import java.util.*;

public class ReverseNum{
    public static void main(String args[]){
        int num = 16022005;
        while(num>0){
            int lastNum = num % 10;
            System.out.print(lastNum);
            num = num / 10;
        }
    }
}

