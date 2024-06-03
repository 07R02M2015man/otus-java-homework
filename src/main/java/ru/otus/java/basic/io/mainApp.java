package ru.otus.java.basic.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {

        String directoryPath = "/Users/tatanamakarenko/Documents/Java. Basic/otus-java-homework";
        listOfDirectory(directoryPath);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String nameFile = scanner.next();
        readFile(nameFile);

        System.out.println();
        System.out.print("Напишите произвольный текст: ");
        String textForFile = scanner.next();
        writeToFile(nameFile, "\n" + textForFile);
    }

    private static void listOfDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] filesList = directory.listFiles();
            if (filesList != null) {
                System.out.println("Файлы в директории " + directoryPath + ":");
                for (File file : filesList) {
                    if (!file.isDirectory()) {
                        System.out.println(file.getName());
                        ;
                    }
                }
            } else {
                System.out.println("Произошла ошибка при чтении содержимого директории.");
            }
        } else {
            System.out.println(directoryPath + " не является директорией.");
        }
    }

    private static void writeToFile(String nameFile, String textForFile) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(nameFile, true))) {
            byte[] buffer = textForFile.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
            System.out.println("Файл обновлен!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String nameFile) {
        File file = new File(nameFile);
        if (file.exists()) {
            try (InputStreamReader in = new InputStreamReader(new FileInputStream(nameFile))) {
                int n = in.read();
                if (file.length() == 0) {
                    System.out.println("Файл пустой");
                } else {
                    System.out.println("Содержимое файла: ");
                    while (n != -1) {
                        System.out.print((char) n);
                        n = in.read();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Такого файла нет в данной директории!");
        }
    }
}
