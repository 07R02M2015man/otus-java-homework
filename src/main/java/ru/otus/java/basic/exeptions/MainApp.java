package ru.otus.java.basic.exeptions;

public class MainApp {
    public static void main(String[] args) throws AppArraySizeException {
        String[][] arr1 = {{"1", "-2", "4", "5" }, {"1", "1", "4", "6" }, {"9", "1", "4", "-20" }, {"8", "12", "-3", "33" }};
        System.out.println("Сумма элементов массива: " + sumOfElements(arr1));
    }

    public static int sumOfElements(String[][] arr) throws AppArraySizeException {
        if (arr.length != 4) {
            throw new AppArraySizeException("Массив должен быть 4х4");
        } else {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new AppArrayDataException("Ошибка: в ячейке массива [" + i + "][" + j + "]" + " лежат неверные данные");
                    }
                }
            }
            return sum;
        }
    }
}
