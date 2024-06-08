package ru.otus.java.basic.net.server;

import java.io.*;
import java.net.*;

public class CalculatorServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Сервер запущен и ожидает подключения...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Клиент подключен");

                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                output.println("Доступные операции для вычисления: +, -, *, /");

                String expression = input.readLine();
                double result = calculate(expression);

                output.println("Результат: " + result);

                socket.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка сервера: " + e.getMessage());
        }
    }

    private static double calculate(String expression) {
        String[] parts = expression.split(" ");
        double operand1 = Double.parseDouble(parts[0]);
        String operation = parts[1];
        double operand2 = Double.parseDouble(parts[2]);

        return switch (operation) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> 0;
        };
    }
}
