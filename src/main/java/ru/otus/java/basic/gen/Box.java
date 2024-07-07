package ru.otus.java.basic.gen;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final int maxWeight;
    private int currentWeight;
    private final List<T> fruits;

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getWeight() {
        return currentWeight;
    }

    public Box(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.fruits = new ArrayList<>();
    }

    public boolean addFruit(T fruit) {
        if ((maxWeight - currentWeight) < fruit.getWeight()) {
            System.out.println("Нельзя положить фрукт в коробку! Превышает максимальный вес!");
            return false;
        }
        fruits.add(fruit);
        currentWeight += fruit.getWeight();
        return true;
    }


    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) <= 0.001;
    }


    public void transferFruits(Box<? super T> targetBox) {
        if (fruits.isEmpty()) {
            System.out.println("Исходная коробка пустая");
            return;
        }
        if (this == targetBox) {
            System.out.println("Задайте коробку для пересыпания");
            return;
        }
        if (this.getWeight() < targetBox.getMaxWeight()) {
            targetBox.fruits.addAll(this.fruits);
            this.fruits.clear();
            System.out.println("Фрукты переместрили");
        } else {
            System.out.println("Нельзя переместить фрукты. Вес пересыпаемых фруктов больше максимального веса коробки");
        }
    }


    public void relocateFruits(Box<? super T> targetBox, int count) {
        int counter = 0;
        for (int i = 0; i < count; i++) {
            if (fruits.isEmpty()) {
                System.out.println("Исходная коробка пустая");
                return;
            }
            if (targetBox.getWeight() + fruits.get(0).getWeight() < targetBox.getMaxWeight()) {
                targetBox.addFruit(fruits.get(0));
                currentWeight -= fruits.get(0).getWeight();
                fruits.remove(0);
                counter++;
            } else {
                System.out.println("Нельзя переместить фрукты. Коробка уже полная");
                return;
            }
        }
        System.out.println("Переместили количество фруктов: " + counter);
    }

}
