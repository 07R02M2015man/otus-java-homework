package ru.otus.java.basic.hpoop2.animals;

public abstract class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int endurance;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    public void setSpeedSwim(int speedSwim) {
        this.speedSwim = speedSwim;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public String getName() {
        return name;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public int getSpeedSwim() {
        return speedSwim;
    }

    public int getEndurance() {
        return endurance;
    }

    public void info() {
        System.out.println(name + " обладает скоростью бега " + speedRun + "м/с, скоростью плавания " + speedSwim + "м/с и выносливостью " + endurance + "ед.");
    }

    public Animal(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    public void run(int distance) {
        info();
        int rez = (endurance -= distance);
        System.out.println(rez);
        if (rez < 0) {
            System.out.println("Устал. Пробежал только " + (distance+rez) + " метров за " + ((distance+rez)/ speedRun)+ " сек");
            System.out.println("Выносливость: -1");
            endurance = -1;
        } else {
            System.out.println(name + " пробежал расстояние за " + (distance / speedRun) + " сек");
        }

    }

    public abstract void swim(int distance);

}
