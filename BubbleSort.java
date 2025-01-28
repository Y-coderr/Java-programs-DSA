public class BubbleSort{
    public static void sort(int arr[]){
       for(int turn=0;turn<arr.length-1;turn++){
        for(int i=0;i<arr.length-1-turn;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
       }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        sort(arr);
        System.out.println("Array sorted succesfully");
    }
}