package at.fhj.msd;

public class Main {

    public static void main(String[] args) {
        System.out.println("Alena Vodopianova");
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 3));
        System.out.println("Difference: " + calc.minus(5, 3));
        System.out.println("Product: " + calc.multiply(5, 3));
        System.out.println("Quotient: " + calc.divide(5, 3));
    }
}
