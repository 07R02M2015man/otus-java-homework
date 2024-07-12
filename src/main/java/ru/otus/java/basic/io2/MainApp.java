package ru.otus.java.basic.io2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите имя файла:");
        String searchFile = scanner.nextLine();
        System.out.println("Введите текст для поиска:");
        String text = scanner.nextLine();
        System.out.println("Количество вхождений заданного текста: " + findText(searchFile, text));
    }

    private static int findText(String searchFile, String text) {
        int count = 0;

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(searchFile))) {
            byte[] bytes = bufferedInputStream.readAllBytes();
            String data = new String(bytes, StandardCharsets.UTF_8);
            int index = 0;
            while (data.indexOf(text, index) != -1) {
                count++;
                index = data.indexOf(text, index) + text.length();
            }

        } catch (IOException ex) {
//            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return count;
    }
}
