package ru.otus.java.basic.thread;

public class ThreadArray {
    public static void main(String[] args) throws InterruptedException {
        int size = 100000000;
        double[] array = new double[size];
        singleThreadArray(array);
        multiTreadArray(array);
    }

    private static void singleThreadArray(double[] array) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения одного потока: " + (endTime - startTime) + " мс");
    }

    private static void multiTreadArray(double[] array) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        Thread[] threads = new Thread[4];
        for (int t = 0; t < threads.length; t++) {
            final int start = (array.length / threads.length) * t;
            //System.out.println(start);
            final int end = (array.length / threads.length) * (t + 1);
            //System.out.println(end);
            threads[t] = new Thread(() -> {
                for (int i = start; i < end; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            threads[t].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения 4х потоков: " + (endTime - startTime) + " мс");
    }

}

