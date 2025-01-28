public class decreasingNum{
    public static void printNums(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printNums(n-1);
    }
     public static void main(String args[]){
        int n=10;
        printNums(n);
     }
}