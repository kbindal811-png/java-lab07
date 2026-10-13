// File name: Q8_ThrowsNumberFormat.java
import java.util.Scanner;

public class Q8_ThrowsNumberFormat {
    static int readNumber(Scanner sc) throws NumberFormatException {
        System.out.print("Enter an integer: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number = readNumber(sc);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer entered.");
        } finally {
            sc.close();
        }
    }
}
