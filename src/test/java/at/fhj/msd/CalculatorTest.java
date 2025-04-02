package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach  // Выполняется перед каждым тестом
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void testMinus() {
        assertEquals(1, calculator.minus(3, 2));
        assertEquals(-4, calculator.minus(-2, 2));
        assertEquals(0, calculator.minus(5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001);
        assertEquals(-2.5, calculator.divide(-5, 2), 0.001);

    }
}
