import java.util.*;
public class ShortestPathStr{
    public static void ShortestPath(String str){
        int n=str.length();
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            char dir = str.charAt(i);
            if(dir =='N'){
                y=y+1;
            }
            else if(dir =='S'){
                y=y-1;
            }
            else if(dir =='W'){
                x=x-1;
            }
            else{
                x=x+1;
            }
        }
        float shortpath = (float)Math.sqrt(x*x+y*y);
        System.out.println("Shortest path is  "+shortpath);
    }
    public static void main(String args[]){
        String str = "WNEENESENNN";
        ShortestPath(str);
    }
}