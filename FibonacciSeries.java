import java.util.*;
public class FibonacciSeries{
    public static void Fibonacci(int n){
    try
    {
        int n1=0,n2=1,n3,i;    
        System.out.print(n1+" "+n2); 
    
        for(i=2;i<n;++i)  
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }    
    }
    catch(Exception e){
        System.out.print(e);
    }
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number for finding fibonacci series:");
      int a = sc.nextInt();
      Fibonacci(a);

    }
}