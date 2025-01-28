import java.util.*;
public class TwoDArray{
   public static void searchminimum(int matrix[][]){
       int min = Integer.MAX_VALUE;
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min =  matrix[i][j];
                }    
            }
        }
        System.out.println("Min value ="+min);
   }

    public static boolean search(int matrix[][],int key){
        Scanner sc = new Scanner(System.in);
       for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
       
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    System.out.println("Match found at ("+i+","+j+")");
                    
                }
            }
        }
        return true;
    }
    public static void twodarray(int matrix[][]){
        int n=matrix.length;
        int m= matrix[0].length;
        Scanner sc = new Scanner(System.in);
        //input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        //twodarray(matrix);
        searchminimum(matrix);
    }
}