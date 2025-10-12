package Algorithms;


// this algortihm is used to sort an array of 0s, 1s and 2s in a single traversal
// it uses three pointers low, mid and high
// low points to the next position of 0, mid is the current element being processed and high points to the next position of 2
// if mid is 0, we swap it with low and increment both low and mid
// if mid is 1, we just increment mid
// if mid is 2, we swap it with high and decrement high
// we stop when mid is greater than high
public class DutchNationalFlag {

    public static void dnfSort(int [] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length-1;


       while(mid <= high){
          if(nums[mid] == 0){
            swap(nums , low , mid);
          }else if(nums[mid] == 1){
            mid++;
          }else{
            swap(nums , high , mid);
            high--;
          }
       }
    }

    public static void swap(int [] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int [] nums = {2 , 2 , 0 , 1 , 2 , 0 , 1 , 1 , 2};

        dnfSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
