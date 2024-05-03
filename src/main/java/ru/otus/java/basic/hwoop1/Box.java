package ru.otus.java.basic.hwoop1;

import java.util.Stack;

public class Box {
    private String name;
    private int width;
    private int length;
    private int height;
    private String color;
    private String status;

    private String thing;

    public void setColor(String color) {
        this.color = color;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setThing(String status) {
        this.status = thing;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getStatus() {
        return status;
    }

    public String getThing() {
        return thing;
    }

    public Box(String name, int width, int length, int height, String color, String status, String thing) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.color = color;
        this.status = status;
        this.thing = thing;
    }

    public void infoBox() {
        System.out.println("Коробка: " + name);
        System.out.println("Размеры коробки: ширина " + width + "см, длина " + length + "см, высота " + height + "см");
        System.out.println("Цвет: " + color);
        System.out.println("Состояние: " + status);
        if (thing.isEmpty()) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("В коробке лежит " + thing);
        }
    }

    public void putSting() {

    }

    public void open() {
        status = "open";
        System.out.println("Открыли коробку");
    }

    public void close() {
        status = "close";
        System.out.println("Закрыли коробку");
    }

    public void putThing(String item) {
        thing = item;
        System.out.println("В коробку положили " + item);
    }

    public void removeThing() {
        System.out.println("Убрали из коробки " + thing);
        thing = "";
    }
}
