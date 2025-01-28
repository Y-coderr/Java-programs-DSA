public class butterfly{
    public static void butterflyPattarn(int n){
        for(int i = 1; i<=n; i++){
            // star - i
            for(int j = 1 ; j<=i; j++){
                System.out.print("*");
            }
            // spaces = 2*(n-i)
            for(int j = 1; j<=2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
             // star - i
            for(int j = 1 ;j<=i; j++){
                System.out.print("*");
            }
            // spaces = 2*(n-i)
            for(int j = 1; j<=2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            // next line 
            System.out.println();
        }
    }
    public static void main(String args[]){
         butterflyPattarn(4);
    }
}