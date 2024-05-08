package ru.otus.java.basic.hpoop2.animals;

public class Horse extends Animal {
    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public void swim(int distance) {
        info();
        for (int i = 1; i < distance; i++) {
            if (endurance < 0) {
                System.out.println("Выносливость: -1");
                System.out.println("Устал, не проплыл расстояние в " + distance + "м");
                return;
            } else {
                endurance -= 4;
            }
        }
        System.out.println(name + " проплыл расстояние за " + (distance / speedSwim) + "сек");

    }
}
