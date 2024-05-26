package ru.otus.java.basic.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainApp {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 7, 2, 3, 6));
        System.out.println("Список значений в интервале от 4 до 10: " + getListFromTo(4, 10));
        System.out.println("Сумма элементов списка, значения которых больше больше 5: " + sumElements(list1));
        System.out.println("Новый список, каждый элемент которого увеличен на 2: " + increaseList(2, list1));
        System.out.println("Перепианный список: " + rewriteList(5, list1));

        System.out.println();
        List<Worker> listWorkers = new ArrayList<>();
        listWorkers.add(new Worker("name1", 30));
        listWorkers.add(new Worker("name2", 20));
        listWorkers.add(new Worker("name3", 22));
        listWorkers.add(new Worker("name4", 40));
        System.out.println("Исходный список сотрудников: " + listWorkers);

        System.out.println("Список имен сотрудников: " + getNamesWorkers(listWorkers));
        System.out.println("Список сотрудников старше 22 лет: " + getMinAgeWorkers(listWorkers, 22));
        System.out.println("Средний возраст сотрудников превышает 25: " + checkAverageAge(listWorkers, 25));
        System.out.println("Самый молодой сотрудник: " + yangestWorker(listWorkers));

    }

    private static Worker yangestWorker(List<Worker> listWorkers) {
        int minAge = listWorkers.getFirst().getAge();
        Worker yangestWorker = listWorkers.getFirst();
        for (Worker wrk : listWorkers) {
            if (wrk.getAge() < minAge) {
                minAge = wrk.getAge();
                yangestWorker = wrk;
            }
        }
        return yangestWorker;
    }

    private static boolean checkAverageAge(List<Worker> listWorkers, int minAverAge) {
        int sumAge = 0;
        for (Worker wrk : listWorkers) {
            sumAge += wrk.getAge();
        }
        return (sumAge / (listWorkers.size()) > minAverAge);
    }

    private static List<Worker> getMinAgeWorkers(List<Worker> listWorkers, int minAge) {
        List<Worker> filteredWorkers = new ArrayList<>();
        for (Worker wrk : listWorkers) {
            if (wrk.getAge() >= minAge) {
                filteredWorkers.add(wrk);
            }
        }
        return filteredWorkers;
    }

    private static List<String> getNamesWorkers(List<Worker> listWorkers) {
        List<String> nameWorkers = new ArrayList<>();
        for (Worker wrk : listWorkers) {
            nameWorkers.add(wrk.getName());
        }
        return nameWorkers;
    }

    //метод, увеличивающий каждый элемент списка на указанное число
    private static List<Integer> increaseList(int num, List<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i) + num);
        }
        return list1;
    }

    //метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен
    //переписать каждую заполненную ячейку списка указанным числом
    private static List<Integer> rewriteList(int num, List<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != 0) {
                list1.set(i, num);
            }
        }
        return list1;
    }

    private static int sumElements(List<Integer> list1) {
        int sum = 0;
        for (Integer elem : list1) {
            if (elem >= 5) {
                sum += elem;
            }
        }
        return sum;
    }

    private static List<Integer> getListFromTo(int min, int max) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list1.add(i);
        }
        return list1;
    }

}
