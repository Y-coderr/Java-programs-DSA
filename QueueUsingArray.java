public class QueueUsingArray{
    static int arr[];
        static int size;
        static int rear;
    public static class Queue{
        Queue(int n){
           arr = new int[n];
           size = n;
           rear =-1;
        }
        public static boolean isEmpty(){
            if(rear == -1)
            {
                 return true;
            }
        }
    }
    // add data
    public static int add(int data){
        if(rear ==-1){
            System.out.println("Array is full");
            return;
        }
        rear = rear+1;
        arr[rear]= data;
    }

    // remove data
    public static int remove(){
        if(rear ==-1){
            System.out.println("Queue is empty");
            return ;
        }
        int front = arr[0];
        for(int i=0; i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear = rear -1;
        return front;
    }
    // peek data
    public static int peek(){
        if(rear ==-1){
            System.out.println("Queue is empty");
            return ;
        }

        return arr[0];
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(3);
        q.add(5);
        q.add(2);
        while(!q.isEmpty){
            System.out.println(q.peek());

        }
    }

}