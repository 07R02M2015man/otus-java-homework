package ru.otus.java.basic.hwoop3;

public class Bike implements Transport {

    public boolean move(Area area, int distance) {
        if (area == Area.SWAMP) {
            System.out.println("Велосипед не сможет проехать по болоту");
            return false;
        }
        System.out.println("Велосипед проехал " + distance + " км");
        return true;
    }

}
