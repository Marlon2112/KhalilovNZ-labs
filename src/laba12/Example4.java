package laba12;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];

        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;
            threads[i - 1] = new Thread(() -> {
                System.out.println("Thread " + threadNumber + ": " + threadNumber);
            });
        }

        for (Thread thread : threads) {
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}