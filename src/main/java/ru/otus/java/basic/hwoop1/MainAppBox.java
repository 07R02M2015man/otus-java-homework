package ru.otus.java.basic.hwoop1;

import java.util.Scanner;

public class MainAppBox {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Box box1 = new Box("Box1", 23, 23, 10, "черный", false, "");
        box1.close();

        System.out.print("\nМеняем цвет. Введите название цвета: ");
        String setColor = scanner.next();
        box1.setColor(setColor);
        System.out.println("Цвет коробки стал: " + box1.getColor());

        System.out.print("\nПопытка положить предмет в коробку! \nВведите название предмета: ");
        String item = scanner.next();
        box1.putThing(item);

//        box1.close();
        System.out.println("\nПопытка убрать предмет из коробки:");
        box1.removeThing();

    }
}
