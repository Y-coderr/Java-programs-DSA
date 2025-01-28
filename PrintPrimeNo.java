public class PrintPrimeNo{
    public static boolean isPrime(int n){

        for(int i = 2 ; i<=Math.sqrt(n);i++){
           if(n%i==0){
            return false;
           }
        }
         return true;
    }
    public static void PrintNo(int a){
        for(int i = 1 ;i<=a ; i++ ){

            if(isPrime(i)==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[])
    {
       PrintNo(10);
    }
}