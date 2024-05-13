package ru.otus.java.basic.oop2hw2;

public class Plate {
    int maxValue;
    int currentFood;
    boolean fullness;

    public int getCurrentFood() {
        return currentFood;
    }

    public void setCurrentFood(int currentFood) {
        this.currentFood = currentFood;
    }

    public Plate(int maxValue) {
        this.maxValue = maxValue;
        this.currentFood = maxValue;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "maxValue=" + maxValue +
                ", currentFood=" + currentFood +
                '}';
    }

    public int addFood(int amountFood) {
        currentFood += amountFood;
        if (currentFood > maxValue) {
            currentFood = maxValue;
        }
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
