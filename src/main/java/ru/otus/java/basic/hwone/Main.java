package ru.otus.java.basic.hwone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            double a = scanner.nextDouble();
            System.out.println("Введите второе число");
            double b = scanner.nextDouble();
            System.out.println("Введите операцию");
            char operation = scanner.next().charAt(0);
            double result;
            if (operation == '+') {
                result = a + b;
            } else if (operation == '-') {
                result = a - b;
            } else if (operation == '*') {
                result = a * b;
            } else if (operation == '/') {
                result = a / b;
            } else {
                System.out.println("ввели некорртекный операнд");
                return;
            }
            System.out.println(a + " " + operation + " " + b + " = " + result);
            System.out.println("Ввесдите Y для повтора.");
            String retryAnswer = scanner.next();
            if (!retryAnswer.equals("Y")) {
                break;
            }
        }
    }

    private static void hardChisla() {//todo: переименовать
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int checkHard;
            do {
                System.out.println("Выберите сложность игры: \n1 - легко \n2 - средне \n3 - сложно");
                checkHard = scanner.nextInt();
            } while (checkHard < 1 || checkHard > 3);
            int maxTry;
            int maxNumber;
            if (checkHard == 1) {
                maxTry = 3;
                maxNumber = 6;
            } else if (checkHard == 2) {
                maxTry = 2;
                maxNumber = 9;
            } else {
                maxTry = 2;
                maxNumber = 15;
            }
            int question = (int) (Math.random() * maxNumber) + 1;
            System.out.println("Игра началась. Компьюетр загадал число");
            while (true) {
                int answer;
                do {
                    System.out.println("Введите числа от 1 до " + maxNumber + ". У вас " + maxTry + " попытки");
                    answer = scanner.nextInt();
                } while (answer < 1 || answer > maxNumber);
                if (question == answer) {
                    System.out.println("Вы победили");
                    break;
                } else if (question > answer) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
                maxTry--;
                if (maxTry == 0) {
                    System.out.println("Вы проиграли");
                    break;
                }
            }
            System.out.println("Ввесдите Y для повтора.");
            String retryAnswer = scanner.next();
            if (!retryAnswer.equals("Y")) {
                System.out.println("Игра окончена");
                break;
            }
        }
    }

    private static void retryInput() {
        Scanner scanner = new Scanner(System.in);
        int n;
        /*System.out.println("введите число от 1 до 5:");
        int n;
        if (n>=1 && n<=5){
            System.out.println("Вы ввели верное значение");
        } else {
            System.out.println("неверное значение" + " введите повторно");
            n = scanner.nextInt();
        }
        */

        // цикл do - while
        /*do {
            System.out.println("введите числа от 1 до 5");
            n = scanner.nextInt();
        } while (n<1 || n>5);
         */

        // цикл с помощью break
        while (true) {
            System.out.println("введите числа от 1 до 5");
            n = scanner.nextInt();
            if (n >= 1 && n <= 5) {
                break;
            }
        }
        System.out.println("n = " + n);
    }

}
