package ru.otus.java.basic.hwoop3;

public class Rover implements Transport {
    private int fuel;

    public Rover(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(Area area, int distance) {
        // вездеход тратит 3 ед топлива на 1 км
        if (fuel < distance * 3) {
            System.out.println("Бензина не хватит для перемещения на заданное расстояние");
            return false;
        }
        fuel -= distance * 3;
        System.out.println("Вездеход проехал " + distance + " км и осталось бензина: " + fuel);
        return true;
    }

}
