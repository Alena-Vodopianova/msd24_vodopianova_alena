package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Die Klasse Calculator bietet grundlegende arithmetische Operationen wie
 * Addition, Subtraktion, Multiplikation,Division und Factorial.
 *
 * @author Alena Vodopianova
 */
public class Calculator {

    /**
     * Logger für die Protokollierung von Berechnungen und Fehlern.
     */
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * Führt die Addition zweier Ganzzahlen durch.
     *
     * @param a erste Ganzzahl
     * @param b zweite Ganzzahl
     * @return Summe der Ganzzahlen a und b
     */
    public int add(int a, int b) {
        logger.debug("add called with parameters: a = {}, b = {}", a, b);
        return a + b;
    }

    /**
     * Führt die Subtraktion einer Ganzzahl von einer anderen durch.
     *
     * @param a Minuend
     * @param b Subtrahend
     * @return Differenz der Ganzzahlen a und b
     */
    public int minus(int a, int b) {
        logger.debug("minus called with parameters: a = {}, b = {}", a, b);
        return a - b;
    }

    /**
     * Führt die Division einer Zahl durch eine andere durch.
     *
     * @param a Dividende
     * @param b Divisor
     * @return Quotient aus der Division von a durch b
     * @throws ArithmeticException wenn der Divisor Null ist
     */
    public double divide(double a, double b) {
        logger.debug("divide called with parameters: a = {}, b = {}", a, b);
        if (b == 0) {
            logger.error("Division by zero: a = {}, b = {}", a, b);
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    /**
     * Führt die Multiplikation zweier Ganzzahlen durch.
     *
     * @param a erste Ganzzahl
     * @param b zweite Ganzzahl
     * @return Produkt der Ganzzahlen a und b
     */
    public int multiply(int a, int b) {
        logger.debug("multiply called with parameters: a = {}, b = {}", a, b);
        return a * b;
    }

    /**
     * Berechnet die Faktorielle einer nicht-negativen Ganzzahl rekursiv.
     *
     * @param n nicht-negative Ganzzahl
     * @return Faktorielle von n, oder 0 wenn n negativ ist
     */
    public int factorial(int n) {
        logger.debug("factorial called with parameter: n = {}", n);
        if (n < 0) {
            return 0;
        }
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}
