package ru.otus.java.basic.tree;

import java.util.List;

public class mainApp {
    public static void main(String[] args) {
        List<Integer> sortedList = List.of(1, 2, 3, 4, 5, 6, 7);
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(sortedList);

        System.out.println("Найти 4: " + tree.find(4));
        System.out.println("Список: " + tree.getSortedList());

    }

}
