package ru.otus.java.basic.hwtwo;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        BackPack backPack = new BackPack();

        backPack.print();

        backPack.put("ball");
        System.out.println(backPack.size());
        backPack.print();

        backPack.put("shoes");
        System.out.println(backPack.size());
        backPack.print();

        backPack.put("pen");
        backPack.put("books");
        backPack.put("bottle");
        backPack.print();
        backPack.put("magazines");
        backPack.get("pen");
        backPack.print();
        backPack.put("magazines");
        backPack.print();
    }


    public static void magicField(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "plum", "kiwi", "pear", "pineapple", "grape", "cherry", "strawberry", "banana" };
        int randomIndex = ((int) (Math.random() * fruits.length));
        String wordToGuess = fruits[randomIndex];
        System.out.println(wordToGuess);

        char[] result = new char[wordToGuess.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = '*';
        }

        boolean win = false;
        while (!win) {
            System.out.println("Введите букву");
            char letter = scanner.next().charAt(0);
            char[] toGuess = wordToGuess.toCharArray();
            System.out.println("Слово: ");
            for (int i = 0; i < toGuess.length; i++) {
                if (toGuess[i] == letter) {
                    result[i] = letter;
                }
            }
            win = true;
            for (int i = 0; i < result.length; i++) {
                if (result[i] == '*') {
                    win = false;
                }
                System.out.print(result[i]);
            }
            System.out.println();

        }
        System.out.println("Слово: " + wordToGuess + ". Вы победили!");
    }

    public static void fruitGame(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "plum", "kiwi", "pear", "pineapple", "grape", "cherry", "strawberry", "banana" };
        int randomIndex = ((int) (Math.random() * fruits.length));
        String workToGuess = fruits[randomIndex];
        System.out.println(workToGuess);
        System.out.println("Угадайте фрукт");
        boolean win = false;
        while (!win) {
            String inputFruit = scanner.next();
            if (workToGuess.equals(inputFruit)) {
                System.out.println("Угадали");
                win = true;
            } else {
                char[] toGuess = workToGuess.toCharArray();
                char[] input = inputFruit.toCharArray();
                for (int i = 0; i < Math.min(toGuess.length, input.length); i++) {
                    if (toGuess[i] == input[i]) {
                        System.out.print(input[i]);
                    } else {
                        System.out.print("*");
                    }
                }
                for (int i = 0; i < (10 - toGuess.length); i++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.println("Не угадали. Введите еще раз");
            }
        }


    }


    private static void maxElementArray() {
        int[] array = {1, 2, 5, 18, 4, 1, 2};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
