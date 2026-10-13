// File name: Q5_ThreadPriorities.java
public class Q5_ThreadPriorities {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " prints " + i);
            }
        };

        Thread low = new Thread(task, "Low");
        Thread normal = new Thread(task, "Normal");
        Thread high = new Thread(task, "High");

        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();
    }
}
// Priority is only a scheduling hint; it does not guarantee execution order.
