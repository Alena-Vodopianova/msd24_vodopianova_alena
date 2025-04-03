package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Testing add method")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Testing minus method")
    void testMinus() {
        assertEquals(2, calculator.minus(5, 3));
    }

    @Test
    @DisplayName("Testing divide method")
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
    }

    @Test
    @DisplayName("Testing divide by zero")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

    @Test
    @DisplayName("Testing multiply method")
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("Testing factorial method")
    void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }
}
