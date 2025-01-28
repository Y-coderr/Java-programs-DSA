import java.util.*;

public class LargestInArray{
    public static int findLargest(int nums[]){
        int l= Integer.MIN_VALUE;    // -infinty 
        for(int i=0; i<8 ; i++){    // insted of i<8 we use i<nums.length but i was not supporting that we use like this
            if(nums[i]>l){
                l = nums[i];
            }
        }
        return l;
    }
    public static void main(String args[]){
        int nums[] = {2,7,4,8,6,9,1,0};
        int largest = findLargest(nums);
        System.out.println("largest in array is:" + largest);
    }
}