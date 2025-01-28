import java.util.*;

public class DecimalToBinary{
public static int DecToBin(int n){
   int pow = 0;
   int bin = 0;
   while(0<n){
    int rem = n % 2;       // finding the remainder here 
    bin = bin + (rem * (int)Math.pow(10,pow));    // placing remainder according to their place
    n = n/2;      // Diving the original number by two
    pow++;
   }
   return bin;
}

public static void main(String args[]){
   System.out.print("Enter Decimal number :");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.print("Binary number for Decimal number :" + a + " is " + DecToBin(a));
}
}