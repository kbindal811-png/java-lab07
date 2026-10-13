// File name: Q10_RealLifeMultithreading.java
public class Q10_RealLifeMultithreading {
    public static void main(String[] args) throws InterruptedException {
        Thread printing = new Thread(() -> {
            for (int page = 1; page <= 5; page++) {
                System.out.println("Printer thread: printing page " + page);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }, "Printer");

        Thread processing = new Thread(() -> {
            for (int item = 1; item <= 5; item++) {
                System.out.println("Processing thread: processing item " + item);
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }, "Processor");

        printing.start();
        processing.start();
        printing.join();
        processing.join();
        System.out.println("Both tasks completed.");
    }
}
// Printer handles page printing; Processor handles data processing concurrently.
