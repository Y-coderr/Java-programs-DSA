import java.util.*;

public class EvenOdd{
    public static void checkEvenOdd(int number){
        try{
            if (number % 2 == 0) {
                System.out.println(number + " is even number.");
            } else {
                System.out.println(number + " is odd number.");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        checkEvenOdd(number);
    }
}