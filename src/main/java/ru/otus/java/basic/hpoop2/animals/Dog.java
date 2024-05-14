package ru.otus.java.basic.hpoop2.animals;

public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public void swim(int distance) {
        info();
        if ((endurance / 2) < distance) {
            System.out.println("Устал. Проплыл только " + (endurance / 2) + " из " + distance + " метров  за " + ((endurance / 2) / speedRun) + " сек");
            endurance = -1;
            System.out.println("Выносливость: -1");
        } else {
            endurance = endurance - (distance * 2);
            System.out.println(name + " проплыл расстояние за " + (distance / speedSwim) + "сек");
        }


    }
}
