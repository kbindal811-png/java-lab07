// File name: Main.java
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Rectangle r = new Rectangle(4, 5);
        System.out.printf("Circle area: %.2f%n", c.area());
        System.out.println("Rectangle area: " + r.area());
    }
}
