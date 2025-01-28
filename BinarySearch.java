public class BinarySearch{
    public static int Search(int nums[], int key){
        int start=0;
        int end = nums.length;
        int mid = start+end/2;
        while(start<=end){
           if(nums[mid]==key){
            return nums[mid];
           }
           if(nums[mid]>key){
               end = mid-1;
           }
           else{
            start= mid +1;
           }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[]={2,4,6,8,10,12,14,16,18};
        int key= 8;
        int res = Search(nums,key);
        System.out.println("Binary search result :" + res);
    }
}