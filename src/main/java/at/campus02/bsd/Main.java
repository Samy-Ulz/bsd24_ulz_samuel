package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        Calculator calc = new Calculator();

        System.out.println(number1 + " + " +  number2 + " = " + calc.add(number1, number2));
        System.out.println(number1 + " - " +  number2 + " = " + calc.subtract(number1, number2));
        System.out.println(number1 + " / " +  number2 + " = " + calc.divide(number1, number2));
        System.out.println(number1 + " * " +  number2 + " = " + calc.multiply(number1, number2));
    }
}
