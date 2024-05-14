package ru.otus.java.basic.hwthree;

import java.util.Random;
import java.util.Scanner;

public class TicToe {

    static char[][] gameField = new char[3][3];
    static final char CROSS = 'X';
    static final char ZERO = '0';
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        init();
        printField();
        boolean gameOn = true;
        while (gameOn) {
            getTurnHuman(CROSS);
            printField();
            if (isWon(CROSS)) {
                System.out.println(CROSS + " --> WINNER");
                return;
            }
            if (isGameOver()) {
                return;
            }

            getTurnRobot(ZERO);
            printField();
            if (isWon(ZERO)) {
                System.out.println(ZERO + " --> WINNER");
                return;
            }
            if (isGameOver()) {
                return;
            }

        }
    }

    private static void gameHuman() {
        boolean gameOn = true;
        char currentLetter = CROSS;
        while (gameOn) {
            getTurnHuman(currentLetter);
            printField();
            if (isWon(currentLetter)) {
                System.out.println(currentLetter + " --> WINNER");
                return;
            }
            if (isGameOver()) {
                return;
            }
            currentLetter = switchLetter(currentLetter);
        }
    }

    private static char switchLetter(char currentLetter) {
        // одно и тоже
        // currentLetter = (currentLetter ==CROSS) ? ZERO: CROSS;

        if (currentLetter == CROSS) {
            currentLetter = ZERO;
        } else {
            currentLetter = CROSS;
        }
        return currentLetter;
    }

    private static boolean isWon(char letter) {
        return isHorisontalField(letter) || isVerticalField(letter) || isDiagonalField(letter);
    }

    private static boolean isHorisontalField(char letter) {
        for (int i = 0; i < gameField.length; i++) {
            if ((gameField[i][0] == letter) && (gameField[i][1] == letter) && (gameField[i][2] == letter)) {
                return true;

            }
        }
        return false;
    }

    private static boolean isVerticalField(char letter) {
        for (int j = 0; j < gameField.length; j++) {
            if ((gameField[0][j] == letter) && (gameField[1][j] == letter) && (gameField[2][j] == letter)) {
                return true;

            }
        }
        return false;
    }

    private static boolean isDiagonalField(char letter) {
        return ((gameField[0][0] == letter) && (gameField[1][1] == letter) && (gameField[2][2] == letter))
                || ((gameField[0][2] == letter) && (gameField[1][1] == letter) && (gameField[2][0] == letter));
    }

    private static boolean isGameOver() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (gameField[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void getTurnHuman(char letter) {
        int x;
        int y;
        while (true) {
            System.out.print("строка = ");
            x = sc.nextInt() - 1;
            System.out.print("столбец = ");
            y = sc.nextInt() - 1;
            if (setLetter(x, y, letter)) {
                return;
            }
        }
    }

    private static void getTurnRobot(char letter) {
        char alientLetter = (letter ==ZERO)? CROSS:ZERO;
        int x;
        int y;
        do {
            //проверка на победу
            for (int i = 0; i < gameField.length; i++) {
                for (int j = 0; j < gameField.length; j++) {
                    if (gameField[i][j] == ' ') {
                        gameField[i][j] = letter;
                        if (isWon(letter)) {
                            return;
                        }
                        gameField[i][j] = ' ';
                    }
                }
            }
            // помеха сопернику победить
            for (int i = 0; i < gameField.length; i++) {
                for (int j = 0; j < gameField.length; j++) {
                    if (gameField[i][j] == ' ') {
                        gameField[i][j] = alientLetter;
                        if (isWon(alientLetter)) {
                            gameField[i][j] = letter;
                            return;
                        }
                        gameField[i][j] = ' ';
                    }
                }
            }
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!setLetter(x, y, letter));
    }

    private static boolean setLetter(int x, int y, char letter) {
        if (gameField[x][y] == ' ') {
            gameField[x][y] = letter;
            return true;
        }
        return false;
    }

    private static void init() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = ' ';
            }
        }
    }

    private static void printField() {
        System.out.print("   ");
        for (int i = 0; i < gameField.length; i++) {
            System.out.print((i + 1) + "   ");
        }
        System.out.println();
        for (int i = 0; i < gameField.length; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(" " + gameField[i][j] + " |");
            }
            System.out.println();
        }
    }
}
