public class tilingProblem{
    public static int tilingPrb(int n){    // 2 x n (floor size)
        
        // base case
        if (n==0 || n==1){
            return 1;
        }

        // vericle choice
        int fnm1 =tilingPrb(n-1);
        //horizontal choice
        int fnm2=tilingPrb(n-2);

        //total ways
        int totways = fnm1+fnm2;

        return totways;
    }
    public static void main(String args[]){
        System.out.println(tilingPrb(3));
    }
}