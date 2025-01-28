// reverse number and store it into the another variable
public class RevNum2{
    public static void main(String args[]){
       int n=10899;
       int rev=0;
       int lastNum;
       while(0<n)
       {
          lastNum=n%10;     // for getting last digit of the number
          rev=rev*10+lastNum;  // adding last digit of the n to the first digit of the rev
          n=n/10;            // updating value of n means delating last digit of the n
       }
       System.out.print(rev);
    }
}