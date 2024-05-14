package ru.otus.java.basic.hpoop2.animals;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public int swim(int distance) {
        int time = 0;
        System.out.println("Кот " + name + " не умеет плавать");
        return time;
    }

}
