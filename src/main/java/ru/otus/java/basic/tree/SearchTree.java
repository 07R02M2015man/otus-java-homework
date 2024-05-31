package ru.otus.java.basic.tree;

import java.util.List;

public interface SearchTree<T> {
    T find(T element);
    List<T> getSortedList();
}

