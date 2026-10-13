// File name: Q4_NestedTryBlocks.java
public class Q4_NestedTryBlocks {
    public static void main(String[] args) {
        int[] values = {5, 10, 15};
        int numerator = 20;
        int denominator = 0;

        try {
            try {
                System.out.println("Array value: " + values[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid array index.");
            }
            System.out.println("Division result: " + (numerator / denominator));
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero.");
        }
    }
}
