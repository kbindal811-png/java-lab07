// File name: Q2_ArrayIndexOutOfBounds.java
import java.util.Scanner;

public class Q2_ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an index (0 to 4): ");
            int index = sc.nextInt();
            System.out.println("Value: " + values[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Enter a number from 0 to 4.");
        } finally {
            sc.close();
        }
    }
}
