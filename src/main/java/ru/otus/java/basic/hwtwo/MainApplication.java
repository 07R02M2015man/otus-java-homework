package ru.otus.java.basic.hwtwo;

import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 5, 10, 5, 10, 6, 3, 2};

        System.out.println("Введите номер задания от 1 до 5");
        int numberTask = scanner.nextInt();
        if (numberTask == 1) {
            printLine(4, "Текст на печать!");
        } else if (numberTask == 2) {
            sumArray(arr);
        } else if (numberTask == 3) {
            fillArray(6, arr);
        } else if (numberTask == 4) {
            increaseArray(3, arr);
        } else if (numberTask == 5) {
            sumElements(arr);
        } else {
            System.out.println("Такого задания нет");
        }
    }

    //пятое задание
    private static void sumElements(int[] array) {
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum1 += array[i];
        }
        System.out.println("Сумма первой половины массива: " + sum1);
        for (int i = array.length / 2; i < array.length; i++) {
            sum2 += array[i];
        }
        System.out.println("Сумма второй половины массива: " + sum2);
        if (sum1 > sum2) {
            System.out.println("Сумма первой половины массива больше");
        } else {
            System.out.println("сумма второй половины массива больше");
        }
    }

    //четвертое задание
    private static void increaseArray(int value, int[] array) {
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
        System.out.print("Измененный массив: ");
        System.out.println(Arrays.toString(array));
    }

    //третье задание
    private static void fillArray(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    //второе задание
    private static void printLine(int maxCount, String text) {
        for (int i = 0; i < maxCount; i++) {
            System.out.println(text);
        }
    }

    //первое задание
    private static void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }


}
