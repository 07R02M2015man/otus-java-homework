package ru.otus.java.basic.hpoop2.animals;

public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public int swim(int distance) {
        info();
        int time;
        if ((endurance / 2) < distance) {
            time = (endurance / 2) / speedRun;
            System.out.println("Устал. Проплыл только " + (endurance / 2) + " из " + distance + " метров");
            endurance = -1;
            System.out.println("Выносливость: -1");
        } else {
            endurance = endurance - (distance * 2);
            time = distance / speedSwim;
            System.out.println(name + " проплыл все расстояние!");
        }
        System.out.print("Время: ");
        return time;

    }
}
