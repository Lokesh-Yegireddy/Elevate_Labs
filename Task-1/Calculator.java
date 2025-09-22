import java.util.Scanner;

public class Calculator {

    // Addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division (returns double for precision)
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Two-Operand Calculator ===");

        while (keepRunning) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            String opName = "";
            switch (choice) {
                case 1:
                    opName = "Addition";
                    break;
                case 2:
                    opName = "Subtraction";
                    break;
                case 3:
                    opName = "Multiplication";
                    break;
                case 4:
                    opName = "Division";
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-5.");
                    continue;
            }

            // Input prompts with operation name
            System.out.print("Enter first number for " + opName + ": ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number for " + opName + ": ");
            int num2 = scanner.nextInt();

            // Single switch-case for calculation & result display
            switch (choice) {
                case 1:
                    System.out.println("Addition Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Subtraction Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Multiplication Result: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Division Result: " + divide(num1, num2));
                    break;
            }
        }

        scanner.close();
    }
}
