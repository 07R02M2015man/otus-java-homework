package ru.otus.java.basic.hwoop1;

import java.util.Stack;

public class Box {
    private String name;
    private int width;
    private int length;
    private int height;
    private String color;
    private boolean isOpened;
    private String thing;

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }


    public String getThing() {
        return thing;
    }

    public void setThing(String status) {
        this.thing = thing;
    }

    public Box(String name, int width, int length, int height, String color, boolean isOpened, String thing) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.color = color;
        this.isOpened = isOpened;
        this.thing = thing;
    }

    public void infoBox() {
        System.out.println("Коробка: " + name);
        System.out.println("Размеры коробки: ширина " + width + "см, длина " + length + "см, высота " + height + "см");
        System.out.println("Цвет: " + color);
        if (isOpened()) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
        if (thing.isEmpty()) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("В коробке лежит " + thing);
        }
    }

    public void open() {
        if (isOpened) {
            System.out.println("Коробка уже открыта");
        } else {
            isOpened = true;
            System.out.println("Открыли коробку");
        }
    }

    public void close() {
        if (isOpened) {
            isOpened = false;
            System.out.println("Закрыли коробку");
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }

    public void putThing(String item) {
        if (getThing().isEmpty()) {
            if (isOpened) {
                thing = item;
            } else {
                open();
                thing = item;
            }
        } else {
            if (isOpened) {
                removeThing();
                thing = item;
            } else {
                open();
                removeThing();
                thing = item;
            }
        }
        System.out.println("В коробку положили " + item);
    }

    public void removeThing() {
        if (getThing().isEmpty()) {
            System.out.println("Коробка пустая");
        } else {
            String removeThing = thing;
            if (isOpened) {
                thing = "";
            } else {
                open();
                thing = "";
            }
            System.out.println("Убрали из коробки " + removeThing);
        }
    }
}
