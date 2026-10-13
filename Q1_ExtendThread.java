// File name: Q1_ExtendThread.java
class MessageThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from thread: " + i);
        }
    }
}

public class Q1_ExtendThread {
    public static void main(String[] args) {
        new MessageThread().start();
    }
}
