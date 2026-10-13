// File name: Q9_FinallyVsReturn.java
public class Q9_FinallyVsReturn {
    static int getValue() {
        try {
            System.out.println("Inside try block");
            return 10;
        } finally {
            System.out.println("Inside finally block");
        }
    }

    public static void main(String[] args) {
        int value = getValue();
        System.out.println("Returned value: " + value);
    }
}

// Explanation: finally executes before control returns to the caller.
// The value 10 is then printed by main().
