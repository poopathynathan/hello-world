import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Display result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        
        sc.close();
    }
}
