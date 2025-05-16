package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @DisplayName("Tests for add() method")
    @Test
    void testAdd() {
        assertEquals(5.0, calc.add(2.0, 3.0));
        assertEquals(-1.0, calc.add(2.0, -3.0));
        assertEquals(2.0, calc.add(2.0, 0.0));
    }

    @DisplayName("Tests for subtract() method")
    @Test
    void testSubtract() {
        assertEquals(1.0, calc.subtract(5.0, 4.0));
        assertEquals(-7.0, calc.subtract(-2.0, 5.0));
        assertEquals(2.0, calc.subtract(2.0, 0.0));
    }

    @DisplayName("Tests for multiply() method")
    @Test
    void testMultiply() {
        assertEquals(6.0, calc.multiply(2.0, 3.0));
        assertEquals(-8.0, calc.multiply(2.0, -4.0));
        assertEquals(0.0, calc.multiply(2.0, 0.0));
    }

    @DisplayName("Tests for divide() method")
    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(6.0, 3.0));
        assertEquals(-2.5, calc.divide(5.0, -2.0));
        assertEquals(Double.POSITIVE_INFINITY, calc.divide(2.0, 0.0));
    }
}
