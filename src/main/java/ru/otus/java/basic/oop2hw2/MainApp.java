package ru.otus.java.basic.oop2hw2;

import ru.otus.java.basic.hwoop1.User;

public class MainApp {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Barsik", 40);
        Cat[] cats = {
                new Cat("Barsik", 120),
                new Cat("Murzik", 60),
                new Cat("Kuzya", 30)
        };

        Plate plate1 = new Plate(100);
//        System.out.println(plate1);
//        cat1.eat(plate1);
//        System.out.println(plate1);
//        cat1.eat(plate1);

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].eat(plate1));
        }
        System.out.println(plate1.addFood(100));
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].eat(plate1));
        }
    }
}
