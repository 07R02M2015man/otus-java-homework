package ru.otus.java.basic.hpoop2.animals;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    @Override
    public void swim(int distance) {
            System.out.println("Кот " + name + " не умеет плавать");
        }

    }
