public class CircularQueueUsingArray{
    
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
           arr = new int[n];
           size = n;
           rear =-1;
           front = -1;

        }
        public static boolean isEmpty(){
            if(front == -1 &&rear == -1)
            {
                 return true;
            }
        }
        public static boolean isFull(){
            return (rear+1)%size ==front;
        }
    }
    // add data
    public static int add(int data){
        if(isFull){
            System.out.println("Array is full");
            return;
        }
        if(front == -1){
            front =0;
        }
        rear = (rear+1)%size;
        arr[rear]= data;
    }

    // remove data
    public static int remove(){
        if(rear ==-1){
            System.out.println("Queue is empty");
            return ;
        }
        int result = arr[front];
        front= (front+1)%size;
        if(rear == front){
            rear = front = -1;
        }else{
            front= (front+1)%size;
        }
        return result;
    }
    // peek data
    public static int peek(){
        if(rear ==-1){
            System.out.println("Queue is empty");
            return ;
        }

        return arr[front];
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