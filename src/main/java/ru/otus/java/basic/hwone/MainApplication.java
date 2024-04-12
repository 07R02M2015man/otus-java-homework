package ru.otus.java.basic.hwone;
import java.util.Scanner;
import static java.lang.System.in;
public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Введите число от 1 до 5");
        int numberTask = scanner.nextInt();
        if (numberTask == 1) {
            greetings();
        } else if (numberTask == 2) {
            checkSign(2, 4, 7);
        } else if (numberTask == 3) {
            selectColor();
        } else if (numberTask == 4) {
            compareNumbers();
        } else if (numberTask == 5){
            addOrSubtractAndPrint(6,4,false);
        } else {
            System.out.println("Вы ввели неверное число");
        }

    }
    public static void greetings(){
        System.out.println("Hello\nworld\nfrom\nJava");
    }
    public static void checkSign(int a,int b, int c){
        int sum = a+b+c;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor(){
        int data = 34;
        if (data <= 10){
            System.out.println("Красный");
        } else if (data <= 20){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 56;
        int b = 45;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment == true) {
            int result = initValue + delta;
            System.out.println(result);
        } else {
            int result = initValue - delta;
            System.out.println(result);
        }
    }
}
