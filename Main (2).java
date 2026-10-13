// File name: Main.java
import testpack.PublicHello;

public class Main {
    public static void main(String[] args) {
        PublicHello obj = new PublicHello();
        obj.display();

        // The following does NOT compile from outside package testpack:
        // testpack.DefaultHello hidden = new testpack.DefaultHello();
        // DefaultHello is not public, so it cannot be accessed here.
    }
}
