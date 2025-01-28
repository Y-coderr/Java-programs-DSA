//in this example we are making the function for converting binary number to decimal
import java.util.*;

public class BinaryToDecimal{
    public static int bintodec(int n){
        int dec = 0;
        int pow = 0;
        while (0<n){
            int lastdigit= n % 10;
            dec = dec+(lastdigit * (int)Math.pow(2,pow));
            n = n/10;
            
            pow ++;
        }
       return dec;
    }
    public static void main(String args[]){
       System.out.print("Enter binary number :");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       System.out.print("Decimal number for binary number :" + a + " is " + bintodec(a));

    }
}