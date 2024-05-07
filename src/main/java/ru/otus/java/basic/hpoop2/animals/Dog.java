package ru.otus.java.basic.hpoop2.animals;

public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    @Override
    public void swim(int distance) {
        info();
        for (int i = 1; i < distance; i++) {
            endurance -= 2;
            if (endurance < 0) {
                System.out.println("Выносливость" + endurance);
                System.out.println("Появилась усталость, не проплыл расстояние в " + distance + "м");
                return;
            }
        }
        System.out.println(name + " проплыл расстояние за " + (distance / speedSwim) + "сек");
    }
}
