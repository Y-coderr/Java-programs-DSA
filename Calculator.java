import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        double num1, num2;

        do {
            System.out.println("Enter your choice : ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            ch = sc.nextInt();

            try {
                System.out.println("Enter number 1: ");
                num1 = sc.nextDouble();
                System.out.println("Enter number 2: ");
                num2 = sc.nextDouble();

                switch (ch) {
                    case 1:
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero");
                        }
                        break;
                    default:
                        System.out.println("Enter valid choice");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
            }

            System.out.println("Do you want to continue? (y/n): ");
        } while (sc.next().charAt(0) == 'y');
    }
}
