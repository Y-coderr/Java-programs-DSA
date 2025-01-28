// Linear Search
import java.util.*;

public class LinearSearch{
    public static int Search(int nums[] , int key){
         for(int i=0;i<nums.lenght ; i++ ){
            if(nums[i]==key){
                return i;
            }
            else{
                return -1;
            }
         }
    }
    public static void main(String args[]){
        int nums[]={2,4,6,8,10,12,16};
        int key = 10;
        int index = Search(nums , key);
        if(index == -1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("Number found at index :" + index);
        }
    }
}