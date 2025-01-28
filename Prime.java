import java.util.*;

public class Prime{
    public static void main(String args[])
    {
        
        System.out.println("Enter number for checking prime or not :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime=true;
       for(int i = 2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                isPrime = false;
            }
        }
        if (isPrime == true) {
                System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}