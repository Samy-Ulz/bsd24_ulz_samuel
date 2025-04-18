package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger();

    public double add(double number1, double number2){
        double result = number1 + number2;
        logger.debug("Addition with " + number1 + " and " + number2);
        return result;
    }

    public double subtract(double number1, double number2){
        double result = number1 - number2;
        logger.debug("Subtraction with " + number1 + " and " + number2);
        return result;
    }

    public double divide(double number1, double number2){
        double result = number1 / number2;
        logger.debug("Division with " + number1 + " by " + number2);
        if (number2 == 0) {
            logger.error("Division by zero!");
        }
        return result;
    }

    public double multiply(double number1, double number2){
        double result = number1 * number2;
        logger.debug("Multiplication with " + number1 + " and " + number2);
        return result;
    }
}
