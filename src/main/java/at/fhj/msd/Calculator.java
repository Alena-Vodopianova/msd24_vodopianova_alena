package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.debug("Aufruf der Methode add mit Parametern: a = {}, b = {}", a, b); // Вызов метода add с параметрами
        return a + b;
    }

    public int minus(int a, int b) {
        logger.debug("Aufruf der Methode minus mit Parametern: a = {}, b = {}", a, b); // Вызов метода minus с параметрами
        return a - b;
    }

    public double divide(double a, double b) {
        logger.debug("Aufruf der Methode divide mit Parametern: a = {}, b = {}", a, b); // Вызов метода divide с параметрами
        if (b == 0) {
            logger.error("Versuch, durch Null zu teilen: {} / {}", a, b); // Попытка деления на ноль
            throw new ArithmeticException("Division durch Null ist nicht erlaubt"); // Деление на ноль недопустимо
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        logger.debug("Aufruf der Methode multiply mit Parametern: a = {}, b = {}", a, b); // Вызов метода multiply с параметрами
        return a * b;
    }

    public int factorial(int n) {
        logger.debug("Aufruf der Methode factorial mit Parameter: n = {}", n); // Вызов метода factorial с параметром
        if (n < 0) {
            logger.warn("Negativer Wert für Faktorielle: n = {}", n); // Предупреждение о негативном значении
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
