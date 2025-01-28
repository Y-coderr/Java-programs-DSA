// factorial using for loop and problem of binomial quetiont
import java.util.*;

public class FactUsingForLoop{
    public static int factorial(int a)
    {
        int f = 1;
        for(int i = 1 ; i<=a ; i++)
        {
            f = f * i;
        }
        return f;
    }
    public static int binomialQ(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for N :");
        int n = sc.nextInt();
        System.out.println("Enter value for R :");
        int r = sc.nextInt();
        int nf = factorial(n);
        int rf = factorial(r);
        int nrf = factorial(n-r);
        int res= nf / rf*nrf;
        return res;
    }
    public static void main(String args[]){
        // System.out.print(factorial(4));
        System.out.println("Binomial Quetiont is " + binomialQ());
    }
}