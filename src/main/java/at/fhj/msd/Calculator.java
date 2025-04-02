package at.fhj.msd;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
