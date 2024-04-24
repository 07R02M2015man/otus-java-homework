package ru.otus.java.basic.hwtwo;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StarTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {10, 9, 7, 5, 4, 3, 2, 1, 0};
        int[] arr2 = {1, 3, 6, 5, 8, 4};
        int[] arr3 = {1, 4, 8, 6, 4, 4, 7,};
        System.out.println("Задание №1");
        sumArrays(arr1, arr2, arr3);
        System.out.println("\nЗадание №2");
        comparePartsArray(new int[]{10, 9, 1, 5, 4, 1, 2, 8});
        System.out.println("\nЗадание №3");
        checkOrderArray(arr1);
        System.out.println("\nЗадание №4");
        changeOrderArray(arr1);

    }

    //первое задание
    private static void sumArrays(int[] ar1, int[] ar2, int[] ar3) {
        System.out.println("Исходные массивы:");
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        System.out.println(Arrays.toString(ar3));
        int lenMax = ar1.length;
        if (lenMax < ar2.length) {
            lenMax = ar2.length;
        }
        if (lenMax < ar3.length) {
            lenMax = ar3.length;
        }
        int[] arrNew = new int[lenMax];
        for (int i = 0; i < ar1.length; i++) {
            arrNew[i] += ar1[i];
        }
        for (int i = 0; i < ar2.length; i++) {
            arrNew[i] += ar2[i];
        }
        for (int i = 0; i < ar3.length; i++) {
            arrNew[i] += ar3[i];
        }
        System.out.println("Новый массив:");
        System.out.println(Arrays.toString(arrNew));
    }

    //второе задание
    private static void comparePartsArray(int[] arr1) {
        System.out.println("Исходный массив: " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j <= i; j++) {
                sum1 += arr1[j];
            }
            for (int j = i + 1; j < arr1.length; j++) {
                sum2 += arr1[j];
            }

            if (sum1 == sum2) {
                System.out.println("Сумма левой части до индекса " + i + " равна правой части и равна " + sum1);
                return;
            }
        }
        System.out.println("В массиве нет точки, где сумма левой и правой части равны");
    }

    //третье задание
    private static void checkOrderArray(int[] arr1) {
        System.out.println("Исходный массив: " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] < arr1[i + 1]) {
                System.out.println("Массив не упорядочен по убыванию");
                return;
            }
        }
        System.out.println("Все элементы массива расположены в порядке убывания");
    }

    //четвертое задание
    private static void changeOrderArray(int[] arr1) {
        System.out.println("Исходный массив: " + Arrays.toString(arr1));
        int var;
        int len = arr1.length;
        for (int i = 0; i < len; i++) {
            var = arr1[i];
            arr1[i] = arr1[len - 1];
            arr1[len - 1] = var;
            len -= 1;
        }
        System.out.print("Новый перевернутый массив: ");
        System.out.println(Arrays.toString(arr1));
    }


}
