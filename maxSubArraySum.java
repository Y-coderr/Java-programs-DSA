public class maxSubArraySum{
    public static void maxSum(int nums[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
           int start = i;

           for(int j=i ; j<nums.length ; j++){
            int end = j;
            curr = 0;
            for(int k=start ; k<=end ; k++){
              curr += nums[k];
            }  
            System.out.println(curr);
            if(max<curr){
                max = curr ; 
            }
            
           }
        }
        System.out.println("max Sum:"+max);
    }
    public static void main(String args[]){
       int nums[]={1,-2,6,-1,3};
       maxSum(nums);
    }
}