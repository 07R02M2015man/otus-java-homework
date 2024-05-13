package ru.otus.java.basic.oop2hw2;

public class Cat {
    String name;
    int appetite;
    Boolean wellfed;

    public String getName() {
        return name;
    }

    public Boolean getFullness() {
        return wellfed;
    }

    public void setFullness(Boolean wellfed) {
        this.wellfed = wellfed;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        // кот голодный
        this.wellfed = false;
    }

    public void eatFood(Plate plate) {
        if (!wellfed && plate.reduceFood(appetite)) {
            wellfed = true;
            System.out.println(name + " сытый");
        } else {
            wellfed = false;
            System.out.println(name + " голодный");
        }
    }
}
