public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b + 1 ;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        int sum = add(5, 3);
        int difference = subtract(10, 4);
        Calculator calculator = new Calculator();
        int product = calculator.multiply(6, 7);
        double quotient = divide(20, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}