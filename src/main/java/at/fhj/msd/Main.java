package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("This is an INFO message from Main.");
        logger.error("This is an ERROR message from Main.");

        /*    System.out.println("Alena Vodopianova");
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 3));
        System.out.println("Difference: " + calc.minus(5, 3));
        System.out.println("Product: " + calc.multiply(5, 3));
        System.out.println("Quotient: " + calc.divide(5, 3)); */
    }
}
