// File name: Q4_TwoThreadsNames.java
public class Q4_TwoThreadsNames {
    public static void main(String[] args) {
        Thread first = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }, "First-Thread");

        Thread second = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }, "Second-Thread");

        first.start();
        second.start();
    }
}
// Output order can vary because the JVM/OS scheduler decides when threads run.
