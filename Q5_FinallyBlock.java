// File name: Q5_FinallyBlock.java
public class Q5_FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("File opened");
            int result = 10 / 0; // Deliberately causes an exception
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("An operation failed.");
        } finally {
            System.out.println("Resource closed");
        }
    }
}
