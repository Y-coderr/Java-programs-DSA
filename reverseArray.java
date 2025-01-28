public class reverseArray{
    public static void rev(int nums[]){
       int start = 0;
       int last = nums.length-1;
       while(start<last){
        int temp ;
        temp = nums[start];
        nums[start]=nums[last];
        nums[last]=temp;
        start++;
        last--;
       }
       
    }
    public static void main(String args[]){
       int nums[]={2,4,6,8,10};
       rev(nums);
       for(int i= 0 ; i<nums.length ; i++){
         System.out.print(" "+nums[i]);
       }
    }
}