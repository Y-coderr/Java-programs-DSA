import java.util.ArrayList;

public class HeapPrograms {

    public static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public boolean isEmpty(){
            if(arr.size() == 0){
                return true;
            }else{
                return false;
            }
        }

        public void add(int data){
            arr.add(data);

            //child
            int x = arr.size()-1;
            int par = (x-1)/2; // finding parent

            //fixing heap
            while(x>0 && arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x = par;
                par = (x-1)/2;
            }

        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
           int left = 2*i +1;
           int right = 2*i +2;
           int minIdx = i;

           if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
            minIdx = left;
           }
           if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
            minIdx = right;
           }

           if(minIdx != i){
            int temp = arr.get(i);
            arr.set(i,arr.get(minIdx));
            arr.set(minIdx,temp);

            heapify(minIdx);
           }
        }

        public int remove(){
           int data = arr.get(0);

           //step 1: swap
           int temp = arr.get(0);
           arr.set(0,arr.get(arr.size()-1));
           arr.set(arr.size()-1,temp);

           //remove last
           arr.remove(arr.size()-1);

           // heapify
           heapify(0);
           return data;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
