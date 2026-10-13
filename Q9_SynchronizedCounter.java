// File name: Q9_SynchronizedCounter.java
public class Q9_SynchronizedCounter {
    static int counter = 0;

    static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                increment();
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
    }
}
