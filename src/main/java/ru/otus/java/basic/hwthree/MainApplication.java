package ru.otus.java.basic.hwthree;

import java.util.Scanner;

public class MainApplication {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr1 = {{1, -2, 4, 5}, {-3, 1, 4, 6}, {9, -1, 4, 20}, {8, 12, -3, 33}};
        int[][] arr1copy = {{1, -2, 4, 5}, {-3, 1, 4, 6}, {9, -1, 4, 20}, {8, 12, -3, 33}};
        int[][] arr2 = {{1, -2, 4, 5}};
        int[][] arr3 = {{1}, {-3}, {9}};
        System.out.println("Задание 1:");
        System.out.println("Сумма всех элементов массива, которые больше 0, равна " + sumOfPositiveElements(arr1));

        System.out.println("\nЗадание 2:");
        starsSquare(6);

        System.out.println("\nЗадание 3:");
        zeroOfDiagonal(arr1);

        System.out.println("\nЗадание 4:");
        System.out.println("Максимальный элемент массива " + findMax(arr1copy));

        System.out.println("\nЗадание 5:");
        System.out.println("Сумма элементов второй строки " + sumSecondLine(arr1copy) +
                "\nСумма элементов второго столбца " + sumSecondColumn(arr1copy));
        System.out.println("Если массив из одной строки: \nСумма элементов второй строки " + sumSecondLine(arr2) +
                "\nСумма элементов второго столбца " + sumSecondColumn(arr2));
        System.out.println("Если массив из одного столбца:\nСумма элементов второй строки " + sumSecondLine(arr3) +
                "\nСумма элементов второго столбца " + sumSecondColumn(arr3));
    }

    //первое задание
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    //второе задание
    public static void starsSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //третье задание
    public static void zeroOfDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //четвертое задание
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    //пятое задание
    public static int sumSecondLine(int[][] arr) {
        int sumline = 0;
        System.out.println("\nИсходный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        if (arr.length > 1) {
            for (int j = 0; j < arr[1].length; j++) {
                sumline += arr[1][j];
            }
        } else {
            sumline = -1;
        }
        return sumline;
    }

    public static int sumSecondColumn(int[][] arr) {
        int sumcolumn = 0;
        if (arr[0].length > 1) {
            for (int i = 0; i < arr.length; i++) {
                sumcolumn += arr[i][1];
            }
        } else {
            sumcolumn = -1;
        }
        return sumcolumn;

    }
}
