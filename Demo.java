import java.util.*;
import java.io.*;

public class Demo{
    // public static void  array(int marks[]){
    //     for(int i=0;i<=marks.lenght;i++){
    //         System.out.println(marks[i]);
    //     }
    // }

    public static void stack_push(Stack<Integer> stack){
        for(int i = 0 ; i<5 ; i++){
            stack.push(i);
        }
    }
    public static void stack_peek(Stack<Integer> stack){
        int element = (Integer) stack.peek();
        System.out.println("Elemet at top of the stack is :" +element);
    }
    public static void main(String args[])
    {
        // System.out.println("Enter value of a:");
       
        // char b= 'b';
        // char c = (char)(a-b);
        // System.out.println(c);
        //  Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();

        // int a = 2;
        // int b = 7;
        // int c = 7/2;
        // System.out.println(c);

        // 
        
        // Array demo
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_peek(stack);
    }
}