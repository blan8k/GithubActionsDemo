public class CalculatorTest {
    public static void main(String[] args) {
        if(Calculator.add(2,3) != 5) {
            throw new AssertionError("Addition test failed");
        } 
        
        if(Calculator.subtract(5,3) != 2) {
            throw new AssertionError("Subtraction test failed");
        }

        if(new Calculator().multiply(4,5) != 20) {
            throw new AssertionError("Multiplication test failed");
        }
        if(Calculator.divide(10,2) != 5.0) {
            throw new AssertionError("Division test failed");
        }
        System.out.println("All test passed");
    }
}
