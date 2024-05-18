package ru.otus.java.basic.hwoop3;

public class MainApp {
    public static void main(String[] args) {

        Person person1 = new Person("Петя");
        Car car1 = new Car(1000);
        Horse horse1 = new Horse(100);
        System.out.println(person1);
        person1.move(Area.FOREST, 10);
        person1.getOnTransport(car1);
        person1.move(Area.PLAIN, 10);
        person1.getOnTransport(horse1);
        person1.getOffTransport();
        person1.getOffTransport();
        person1.getOnTransport(horse1);


    }
}
