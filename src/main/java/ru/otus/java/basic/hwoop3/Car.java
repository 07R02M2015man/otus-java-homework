package ru.otus.java.basic.hwoop3;

public class Car implements Transport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(Area area, int distance) {
        if (area == Area.FOREST || area == Area.SWAMP) {
            System.out.println("Машина не сможет проехать по местности: " + area);
            return false;
        }
        // машина тратит 2 ед топлива на 1 км
        if (fuel < distance * 2) {
            System.out.println("Бензина не хватит для перемещения на заданное расстояние");
            return false;
        }
        fuel -= distance * 2;
        System.out.println("Машина проехала " + distance + " км и осталось бензина: " + fuel);
        return true;
    }

}
