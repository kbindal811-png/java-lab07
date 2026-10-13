// File name: PublicHello.java
package testpack;

public class PublicHello {
    public void display() {
        System.out.println("This public class can be accessed outside testpack.");
    }
}

class DefaultHello {
    void display() {
        System.out.println("This class is package-private.");
    }
}
