package ConsoleCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to Console Calculator !");
        Scanner scanner = new Scanner(System.in);
        boolean choice = true;

        while(choice){
            System.out.println("Enter Number 1: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter Number 2: ");
            double num2 = scanner.nextDouble();

            System.out.println("SELECT OPERATION TO BE PERFORM THE ABOVE NUMEBRS.");
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.MULTIPLICATION");
            System.out.println("4.DIVISION");

            int opCode = scanner.nextInt();

            switch (opCode){
                case 1:
                    additon(num1,num2);
            }

        }
    }


    public static double additon(double num1,double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1,double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1,double num2){
        return num1 * num2;
    }

    public  static double division(double num1,double num2){
        return num1 / num2;
    }
}
