package ConsoleCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("======================================");
        System.out.println("      Welcome to Console Calculator   ");
        System.out.println("======================================");

        while (continueCalculation) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");

            System.out.print("Enter your choice (1-8): ");
            int choice = scanner.nextInt();

            double num1 = 0, num2 = 0;

            // For operations that need 2 inputs
            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter Number 1: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter Number 2: ");
                num2 = scanner.nextDouble();
            }

            // For square root
            if (choice == 7) {
                System.out.print("Enter number for square root: ");
                num1 = scanner.nextDouble();
            }

            switch (choice) {
                case 1:
                    System.out.println("Result: " + addition(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiplication(num1, num2));
                    break;
                case 4:
                    if (num2 != 0)
                        System.out.println("Result: " + division(num1, num2));
                    else
                        System.out.println("Error: Cannot divide by zero.");
                    break;
                case 5:
                    if (num2 != 0)
                        System.out.println("Result: " + modulus(num1, num2));
                    else
                        System.out.println("Error: Cannot perform modulus by zero.");
                    break;
                case 6:
                    System.out.println("Result: " + power(num1, num2));
                    break;
                case 7:
                    if (num1 >= 0)
                        System.out.println("Result: " + squareRoot(num1));
                    else
                        System.out.println("Error: Cannot find square root of a negative number.");
                    break;
                case 8:
                    continueCalculation = false;
                    System.out.println("Thank you for using Console Calculator!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 8.");
            }
            Thread.sleep(1000);
        }

        scanner.close();

    }

    // Arithmetic operations
    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
