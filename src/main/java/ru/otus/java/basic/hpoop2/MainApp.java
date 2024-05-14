package ru.otus.java.basic.hpoop2;

import ru.otus.java.basic.hpoop2.animals.Cat;
import ru.otus.java.basic.hpoop2.animals.Dog;
import ru.otus.java.basic.hpoop2.animals.Horse;

public class MainApp {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Barsik", 2,1,40);
//        cat1.run(50);
//        cat1.swim(10);

//        System.out.println();
        Dog dog1 = new Dog("Tuzik", 4,3,1000);
//        dog1.run(100);
        System.out.println(dog1.swim(1));
        dog1.info();

//        System.out.println();
//        Horse horse1 = new Horse("Buran", 3, 3, 1000);
//        System.out.println(horse1.run(100));
//        System.out.println(horse1.swim(1));
    }
}
