public class sumOfnNaturalNumbers{
    public static int sum(int n){
        if(n==1){
            return 1; 
        }
        int snm1 = sum(n-1);
        int sp = n + sum(n-1);
        return sp;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(sum(n));
    }
}

