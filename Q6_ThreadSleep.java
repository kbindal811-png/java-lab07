// File name: Q6_ThreadSleep.java
public class Q6_ThreadSleep {
    public static void main(String[] args) {
        Thread sleeper = new Thread(() -> {
            try {
                System.out.println("Sleeper: going to sleep");
                Thread.sleep(2000);
                System.out.println("Sleeper: awake after 2 seconds");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread active = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Active thread: " + i);
            }
        });

        sleeper.start();
        active.start();
    }
}
