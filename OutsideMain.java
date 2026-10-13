// File name: OutsideMain.java
import demo.AccessDemo;

public class OutsideMain {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println(obj.publicText); // Accessible

        // These lines would cause compilation errors outside package demo:
        // System.out.println(obj.protectedText);
        // System.out.println(obj.defaultText);
        // System.out.println(obj.privateText);
        // protected is accessible in other packages only through subclass rules.
        obj.showInsideClass(); // Public method can display all members internally.
    }
}
