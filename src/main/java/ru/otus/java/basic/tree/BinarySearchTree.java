package ru.otus.java.basic.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements SearchTree<T> {
    private TreeNode<T> root;

    public BinarySearchTree(List<T> sortedList) {
        this.root = sortedListToTree(sortedList, 0, sortedList.size() - 1);
    }

    private TreeNode<T> sortedListToTree(List<T> list, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode<T> node = new TreeNode<>(list.get(mid));
        node.left = sortedListToTree(list, start, mid - 1);
        node.right = sortedListToTree(list, mid + 1, end);
        return node;
    }

    @Override
    public T find(T element) {
        return findInTree(root, element);
    }

    private T findInTree(TreeNode<T> node, T element) {
        if (node == null) return null;
        if (element.compareTo(node.value) == 0) return node.value;
        else if (element.compareTo(node.value) < 0) return findInTree(node.left, element);
        else return findInTree(node.right, element);
    }

    @Override
    public List<T> getSortedList() {
        List<T> sortedList = new ArrayList<>();
        inOrderTraversal(root, sortedList);
        return sortedList;
    }

    private void inOrderTraversal(TreeNode<T> node, List<T> list) {
        if (node == null) return;
        inOrderTraversal(node.left, list);
        list.add(node.value);
        inOrderTraversal(node.right, list);
    }

}

