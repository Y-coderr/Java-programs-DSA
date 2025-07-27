public class QueueUsingArray {

    public static class Queue {
        private int[] arr;
        private int size;
        private int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1; 
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1; 
            }
            int front = arr[0];
           
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1; 
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(3);
        q.add(5);
        q.add(2);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
