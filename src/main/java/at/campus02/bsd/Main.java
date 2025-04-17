package at.campus02.bsd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        double number1, number2;

        System.out.println("Samuel Ulz\n");

        number1 = userInput(scanner, true);
        number2 = userInput(scanner, false);

        System.out.println(number1 + " + " +  number2 + " = " + calc.add(number1, number2));
        System.out.println(number1 + " - " +  number2 + " = " + calc.subtract(number1, number2));
        System.out.println(number1 + " / " +  number2 + " = " + calc.divide(number1, number2));
        System.out.println(number1 + " * " +  number2 + " = " + calc.multiply(number1, number2));

        scanner.close();
    }

    public static double userInput(Scanner scanner, boolean first) {
        double value = 0;

        do {
            System.out.print((first) ? "Enter first number: " : "Enter second number: ");
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            }
            System.out.println("Please enter a valid number!");
            scanner.nextLine();
        } while (true);
    }
}

