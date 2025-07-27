import java.util.*;

public class ArrayUsingStack {
    
    public static class Stack {
        ArrayList<Integer> arr = new ArrayList<>();

        public void push(int n) {
           arr.add(n);
        }

        public int pop() {
            if (arr.isEmpty()) {
                System.out.println("Array Is Empty");
            }
            int n = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            return n;
        }

        public int peek() {
            if (arr.isEmpty()) {
                System.out.println("Array Is Empty");
            }
            return arr.get(arr.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack sc = new Stack();
        sc.push(1);
        sc.push(2);
        sc.push(3);

        System.out.println(sc.peek()); 
        System.out.println(sc.pop());  
        System.out.println(sc.pop());  
        System.out.println(sc.pop());  
       
    }
}
