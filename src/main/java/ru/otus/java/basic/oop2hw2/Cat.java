package ru.otus.java.basic.oop2hw2;

public class Cat {
    private String name;
    private int appetite;
    private Boolean wellfed;

    public String getName() {
        return name;
    }

    public Boolean getWellfed() {
        return wellfed;
    }

    public void setWellfed(Boolean wellfed) {
        this.wellfed = wellfed;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        // кот голодный
        this.wellfed = false;
    }

    public boolean eat(Plate plate) {
        if (wellfed) {
            System.out.print(name + " сытый. ");
        } else if (plate.reduceFood(appetite)) {
            wellfed = true;
            System.out.print(name + "  поел. ");
        } else {
            System.out.print(name + " голодный. Не хватило еды. ");
        }
        System.out.print("Сытость: ");
        return wellfed;
    }
}
