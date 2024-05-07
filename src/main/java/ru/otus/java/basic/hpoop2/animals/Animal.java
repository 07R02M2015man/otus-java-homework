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

    public void run(int distance) {
        info();
        for (int i = 1; i < distance; i++) {
            endurance -= 1;
            if (endurance < 0) {
                System.out.println("Выносливость" + endurance);
                System.out.println("Появилась усталость, не пробежал расстояние в " + distance + "м");
                return;
            }
        }
        System.out.println(name + " пробежал расстояние за " + (distance / speedRun) + "сек");
    }

    public abstract void swim(int distance);

}
