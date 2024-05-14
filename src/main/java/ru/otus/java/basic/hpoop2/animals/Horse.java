package ru.otus.java.basic.hpoop2.animals;

public class Horse extends Animal {
    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public void swim(int distance) {
        info();
        if ((endurance / 4) < distance) {
            System.out.println("Устал. Проплыл только " + (endurance / 4) + " из " + distance + " метров  за " + ((endurance / 4) / speedRun) + " сек");
            endurance = -1;
            System.out.println("Выносливость: -1");
        } else {
            endurance = endurance - (distance * 4);
            System.out.println(name + " проплыл расстояние за " + (distance / speedSwim) + "сек");
        }


    }
}
