package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.debug("add called with parameters: a = {}, b = {}", a, b);
        return a + b;
    }

    public int minus(int a, int b) {
        logger.debug("minus called with parameters: a = {}, b = {}", a, b);
        return a - b;
    }

    public double divide(double a, double b) {
        logger.debug("divide called with parameters: a = {}, b = {}", a, b);
        if (b == 0) {
            logger.error("Division by zero: a = {}, b = {}", a, b);
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        logger.debug("multiply called with parameters: a = {}, b = {}", a, b);
        return a * b;
    }

    public int factorial(int n) {
        logger.debug("factorial called with parameter: n = {}", n);
        if (n < 0) {
            return 0;
        }
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}
