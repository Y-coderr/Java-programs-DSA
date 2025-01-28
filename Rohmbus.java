public class Rohmbus{
    public static void DrawRohmbus(int n){      // solid rohmbus 
        for(int i = 1; i<n ; i++){
            
            for(int k=1 ; k<=(n-i) ; k++ ){
            System.out.print(" ");
         }
           
            for(int j = 1; j<n ; j++){
               System.out.print("*");
            }
            
        System.out.println();
        }
    }
    

    public static void hollowRohumbus(int n){   // hollow rhombus
        for(int i = 1; i<=n ; i++){

             for(int k=1 ; k<=(n-i) ; k++ ){
            System.out.print(" ");
            }
            for(int j = 1; j<=n ; j++){
                if(i==1 || i==n || j==1 || j==n){
                     System.out.print("*");
                }
                else{
                     System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    public static void main(String args[]){
        hollowRohumbus(5);
    }
}