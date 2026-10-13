// File name: Q2_ImplementRunnable.java
class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class Q2_ImplementRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberTask());
        thread.start();
    }
}
