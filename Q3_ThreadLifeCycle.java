// File name: Q3_ThreadLifeCycle.java
public class Q3_ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(300);
                synchronized (Q3_ThreadLifeCycle.class) {
                    System.out.println("Worker running");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("New: " + worker.getState());
        worker.start();
        Thread.sleep(50);
        System.out.println("After start (often RUNNABLE): " + worker.getState());
        Thread.sleep(100);
        System.out.println("During sleep (usually TIMED_WAITING): " + worker.getState());
        worker.join();
        System.out.println("Terminated: " + worker.getState());

        System.out.println("Note: RUNNING is represented by RUNNABLE in Java's Thread.State.");
        System.out.println("BLOCKED occurs when a thread waits to enter a synchronized block.");
    }
}
