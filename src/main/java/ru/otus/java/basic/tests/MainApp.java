package ru.otus.java.basic.tests;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 1, 10, 1, 2, 2, 2, 2};
        System.out.println(Arrays.toString(arrayAfterLastOne(arr)));
        System.out.println(checkArray(arr));
    }


    public static int[] arrayAfterLastOne(int[] array) throws RuntimeException {
        int indexLastOne = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                indexLastOne = i;
            }
        }
        if (indexLastOne == -1) {
            throw new RuntimeException("Входной массив не содержит единиц");
        }
        return Arrays.copyOfRange(array, indexLastOne + 1, array.length);
    }

    public static boolean checkArray(int[] array) {
        boolean isHasOne = false;
        boolean isHasTwo = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                isHasOne = true;
            } else if (array[i] == 2) {
                isHasTwo = true;
            } else {
                return false;
            }
        }
        return (isHasOne && isHasTwo);
    }


}
