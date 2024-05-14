package ru.otus.java.basic.oop2hw2;

public class Plate {
    private int maxFood;
    private int currentFood;

    public int getCurrentFood() {
        return currentFood;
    }

    public void setCurrentFood(int currentFood) {
        this.currentFood = currentFood;
    }

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "maxValue=" + maxFood +
                ", currentFood=" + currentFood +
                '}';
    }

    public int addFood(int amountFood) {
        currentFood += amountFood;
        if (currentFood > maxFood) {
            currentFood = maxFood;
        }
        System.out.print("currentFood: ");
        return currentFood;
    }

    public boolean reduceFood(int countFood) {
        int rest = currentFood - countFood;
        if (rest >= 0) {
            currentFood -= countFood;
            return true;
        } else {
            return false;
        }
    }

}
