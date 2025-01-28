public class SelectionSort{
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
        for(int j=i+1;j<arr.length;j++){
            if(minPos>arr[j]){
                minPos= j;
            }
        }
        //swap
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=arr[minPos];
    }
    System.out.println("Array sorted succesfully");
    }
    public static void main(String args[]){
         int arr[]={5,4,1,3,2};
         sort(arr);

    }
}