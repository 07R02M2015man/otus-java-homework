package ru.otus.java.basic.net.client;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)) {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            String operations = input.readLine();
            System.out.println(operations);

            System.out.println("Введите выражения для вычисления в формате 'число операция число': ");
            String expression = scanner.nextLine();

            output.println(expression);

            String result = input.readLine();
            System.out.println(result);

        } catch (IOException e) {
            System.out.println("Ошибка клиента (возможно пропущены пробелы): " + e.getMessage());
        }
    }
}

