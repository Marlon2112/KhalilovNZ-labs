package laba12;

import java.lang.management.ManagementFactory;
import java.util.*;

public class Example5 {
    private static int maxElement = Integer.MIN_VALUE;
    private static final Object lock = new Object();

    public static void main(String[] args) {

        int[] array = {1, 3, 12, 8, 5, 23, 7, 19, 15, 4, 11, 2, 14, 22, 44, 88, 122};

        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Общее количество потоков: " + ManagementFactory.getThreadMXBean().getThreadCount());
        System.out.println("Количество ядер процессора: " + numThreads);


        int partSize = (int) Math.ceil((double) array.length / numThreads);
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {

            int start = i * partSize;
            int end = Math.min(start + partSize, array.length);


            threads[i] = new Thread(() -> {
                int localMax = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    localMax = Math.max(localMax, array[j]);
                }

                synchronized (lock) {
                    maxElement = Math.max(maxElement, localMax);
                }
            });
        }


        for (Thread thread : threads) {
            thread.start();
        }


        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("Максимальный элемент в массиве: " + maxElement);
    }
}