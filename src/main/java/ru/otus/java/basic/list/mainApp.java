package ru.otus.java.basic.list;

import java.util.ArrayList;
import java.util.Arrays;

public class mainApp {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 7, 2, 3, 6));
        arrayFromTo(4, 10);
        System.out.println("sumElements(list1) = " + sumElements(list1));
        increaseList(2, list1);
        rewriteList(5, list1);

        ArrayList<Worker> listWorkers = new ArrayList<>();
        listWorkers.add(new Worker("name1", 30));
        listWorkers.add(new Worker("name2", 20));
        listWorkers.add(new Worker("name3", 22));
        listWorkers.add(new Worker("name4", 20));
        System.out.println("Исходный список сотрудников: " + listWorkers);

        listNameWorkers(listWorkers);
        minAgeWorkers(listWorkers, 22);
        System.out.println("Превышает средний возраст сотрудников заданное минимальное значение: " + averageAge(listWorkers, 25));
        System.out.println("Самый молодой сотрудник: " + yangestWorker(listWorkers));

    }

    //метод, возвращающий  самого молодого сотрудника
    private static String yangestWorker(ArrayList<Worker> listWorkers) {
        int minAge = listWorkers.getFirst().getAge();
        Worker yangestWorker = listWorkers.getFirst();
        for (int i = 1; i < listWorkers.size(); i++) {
            if (listWorkers.get(i).getAge() < minAge) {
                minAge = listWorkers.get(i).getAge();
                yangestWorker = listWorkers.get(i);
            }
        }
        return yangestWorker.toString();
    }

    // метод, проверяющий что средний возраст сотрудников превышает указанный аргумент
    private static boolean averageAge(ArrayList<Worker> listWorkers, int minAverAge) {
        int sumAge = 0;
        for (int i = 0; i < listWorkers.size(); i++) {
            sumAge += listWorkers.get(i).getAge();
        }
        if (sumAge / (listWorkers.size()) > minAverAge) {
            return true;
        }
        return false;
    }

    //метод, возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
    private static void minAgeWorkers(ArrayList<Worker> listWorkers, int minAge) {
        ArrayList<String> workers = new ArrayList<>();
        for (int i = 0; i < listWorkers.size(); i++) {
            if (listWorkers.get(i).getAge() >= minAge) {
                workers.add(listWorkers.get(i).toString());
            }
        }
        System.out.println("Список сотрудников старше " + minAge + " лет: " + workers);
    }

    //метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен
    private static void listNameWorkers(ArrayList<Worker> listWorkers) {
        ArrayList<String> nameWorkers = new ArrayList<>();
        for (int i = 0; i < listWorkers.size(); i++) {
            nameWorkers.add(listWorkers.get(i).getName());
        }
        System.out.println("Список имен сотрудников: " + nameWorkers);
    }


    //метод, увеличивающий каждый элемент списка на указанное число
    private static void increaseList(int num, ArrayList<Integer> list1) {

        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i) + num);
        }
        System.out.println("list1 = " + list1);
    }

    //метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен
    //переписать каждую заполненную ячейку списка указанным числом
    private static void rewriteList(int num, ArrayList<Integer> list1) {

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != 0) {
                list1.set(i, num);
            }
        }
        System.out.println("list1 = " + list1);
    }

    //    метод, суммирующий все элементы, значение которых больше 5, и возвращающий сумму
    private static int sumElements(ArrayList<Integer> list1) {
        int sum = 0;
        for (Integer elem : list1) {
            if (elem >= 5) {
                sum += elem;
            }
        }
        return sum;
    }

    // метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором
//последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
    private static void arrayFromTo(int min, int max) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list1.add(i);
        }
        System.out.println(list1);
    }

}
