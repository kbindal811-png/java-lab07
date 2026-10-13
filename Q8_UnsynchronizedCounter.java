// File name: Q8_UnsynchronizedCounter.java
public class Q8_UnsynchronizedCounter {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                counter++; // Not atomic; updates can be lost.
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected counter: 200000");
        System.out.println("Actual counter: " + counter);
        System.out.println("A race condition may produce a value below 200000; results can vary.");
    }
}
