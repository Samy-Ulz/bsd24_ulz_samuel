package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Nested
    @DisplayName("Tests for add() method")
    class AddTests {
        @Test
        @DisplayName("Adding two positive numbers")
        void addTwoPositives() {
            assertEquals(5.0, calc.add(2.0, 3.0));
        }

        @Test
        @DisplayName("Adding a positive and a negative number")
        void addPosAndNeg() {
            assertEquals(-1.0, calc.add(2.0, -3.0));
        }

        @Test
        @DisplayName("Adding with zero")
        void addWithZero() {
            assertEquals(2.0, calc.add(2.0, 0.0));
        }
    }

    @Nested
    @DisplayName("Tests for subtract() method")
    class SubtractTests {
        @Test
        @DisplayName("Subtracting two positive numbers")
        void subtractTwoPositives() {
            assertEquals(1.0, calc.subtract(5.0, 4.0));
        }

        @Test
        @DisplayName("Subtracting a positive from a negative number")
        void subtractLargerFromSmaller() {
            assertEquals(-7.0, calc.subtract(-2.0, 5.0));
        }

        @Test
        @DisplayName("Subtracting with zero")
        void subtractWithZero() {
            assertEquals(2.0, calc.subtract(2.0, 0.0));
        }
    }

    @Nested
    @DisplayName("Tests for multiply() method")
    class MultiplyTests {
        @Test
        @DisplayName("Multiplying two positive numbers")
        void multiplyTwoPositives() {
            assertEquals(6.0, calc.multiply(2.0, 3.0));
        }

        @Test
        @DisplayName("Multiplying a positive and a negative number")
        void multiplyPosAndNeg() {
            assertEquals(-8.0, calc.multiply(2.0, -4.0));
        }

        @Test
        @DisplayName("Multiplying by zero")
        void multiplyByZero() {
            assertEquals(0.0, calc.multiply(2.0, 0.0));
        }
    }

    @Nested
    @DisplayName("Tests for divide() method")
    class DivideTests {
        @Test
        @DisplayName("Dividing two positive numbers")
        void divideTwoPositives() {
            assertEquals(2.0, calc.divide(6.0, 3.0));
        }

        @Test
        @DisplayName("Dividing by a negative number")
        void divideByNegative() {
            assertEquals(-2.5, calc.divide(5.0, -2.0));
        }

        @Test
        @DisplayName("Dividing by zero")
        void divideByZero() {
            double result = calc.divide(5.0, 0.0);
            assertEquals(Double.POSITIVE_INFINITY, result);
        }
    }
}
