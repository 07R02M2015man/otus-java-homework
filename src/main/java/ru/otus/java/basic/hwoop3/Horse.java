package ru.otus.java.basic.hwoop3;

public class Horse implements Transport {
    private int energy;

    public Horse(int energy) {
        this.energy = energy;
    }


    public boolean move(Area area, int distance) {
        if (area == Area.SWAMP) {
            System.out.println("Лошадь не может идти по болоту");
            return false;
        }
        // лошадь тратит 1 ед энергии на 1 км
        if (energy < distance) {
            System.out.println("У лошади не хватит сил для перемещения на заданное расстояние");
            return false;
        }
        energy -= distance;
        System.out.println("Лошадь прошла " + distance + " км и осталось энергии: " + energy);
        return true;
    }


}
