// File name: JavaUtilExample.java
import java.util.ArrayList;
import java.util.Scanner;

public class JavaUtilExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("How many names? ");
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name: ");
            names.add(sc.nextLine());
        }

        System.out.println("Names: " + names);
        sc.close();
    }
}
