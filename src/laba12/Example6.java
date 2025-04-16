package laba12;

import java.lang.management.ManagementFactory;

public class Example6 {
    private static int sum = 0; // Общая сумма элементов массива
    private static final Object lock = new Object(); // Объект для синхронизации
    private static final int[] array = {1, 3, 12, 8, 5, 23, 7, 19, 15, 4, 11}; // Пример массива

    public static void main(String[] args) {
        // Получение количества ядер процессора
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Общее количество потоков: " + ManagementFactory.getThreadMXBean().getThreadCount());
        System.out.println("Количество ядер процессора: " + numThreads);

        // Делим массив на части для обработки каждым потоком
        int partSize = (int) Math.ceil((double) array.length / numThreads);
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            // Индексы для подмассива
            int start = i * partSize;
            int end = Math.min(start + partSize, array.length);

            // Поток для суммирования элементов в части массива
            threads[i] = new Thread(() -> {
                int localSum = 0; // Локальная сумма для потока
                for (int j = start; j < end; j++) {
                    localSum += array[j];
                }
                // Синхронизация для добавления локальной суммы к общей
                synchronized (lock) {
                    sum += localSum;
                }
            });
        }

        // Запуск всех потоков
        for (Thread thread : threads) {
            thread.start();
        }

        // Ожидание завершения всех потоков
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Вывод результата
        System.out.println("Сумма элементов массива: " + sum);
    }
}
