package ru.otus.java.basic.hwoop1;

import java.util.Scanner;

public class MainAppBox {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Box box1 = new Box("Box1", 23, 23, 10, "черный", "open", "");
        box1.close();
        System.out.println("Коробка в статусе: " + box1.getStatus());

        System.out.println("\nМеняем цвет");
        box1.setColor("белый");
        System.out.println("Цвет коробки стал: " + box1.getColor());

        System.out.print("\nПопытка положить предмет в коробку! \nВведите название предмета: ");
        String item = scanner.next();

        if (box1.getThing().isEmpty()) {
            if (box1.getStatus().equals("open")) {
                box1.putThing(item);
            } else {
                box1.open();
                box1.putThing(item);
            }
        } else {
            if (box1.getStatus().equals("open")) {
                box1.removeThing();
                box1.putThing(item);
            } else {
                box1.open();
                box1.removeThing();
                box1.putThing(item);

            }
        }

//        box1.close();
//        System.out.println("Коробка в статусе: "+ box1.getStatus());

        System.out.println("\nПопытка убрать предмет из коробки:");

        if (box1.getThing().isEmpty()) {
            System.out.println("Коробка пустая");
        } else {
            if (box1.getStatus().equals("open")) {
                box1.removeThing();
            } else {
                box1.open();
                box1.removeThing();
            }
        }

    }
}
