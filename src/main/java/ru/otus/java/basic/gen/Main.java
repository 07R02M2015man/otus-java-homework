package ru.otus.java.basic.gen;

public class Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>(500);
        Box<Apple> appleBox = new Box<>(1500);
        Box<Fruit> fruitBox = new Box<>(2000);

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        fruitBox.addFruit(new Orange());
        fruitBox.addFruit(new Apple());
        fruitBox.addFruit(new Orange());

        System.out.println("Вес коробки OrangeBox " + orangeBox.getWeight());
        System.out.println("Вес коробки AppleBox: " + appleBox.getWeight());
        System.out.println("Вес коробки FruitBox: " + fruitBox.getWeight());

        System.out.println("Сравнение коробок AppleBox и FruitBox: " + appleBox.compare(fruitBox));
        System.out.println("Сравнение коробок OrangeBox и FruitBox: " + orangeBox.compare(fruitBox));
        System.out.println("Сравнение коробок OrangeBox и AppleBox: " + orangeBox.compare(appleBox));


        //пересыпание всех фруктов
        Box<Apple> newAppleBox = new Box<>(10000);
        appleBox.transferFruits(newAppleBox);

        //пересыавние определенного количества фруктов
        appleBox.relocateFruits(fruitBox, 1);

    }
}
