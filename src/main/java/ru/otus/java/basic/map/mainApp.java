package ru.otus.java.basic.map;

import java.util.*;

public class mainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("name1", "11-11-11");
        phoneBook.add("name1", "12-12-12");
        phoneBook.add("name2", "22-22-22");
        phoneBook.add("name3", "33-33-33");
        System.out.println(phoneBook);

        System.out.println("Номер(а) телефона контакта \"name1\": " + phoneBook.find("name1"));
        System.out.println("Номер 12-12-12 содержится в справочнике: " + phoneBook.containsPhoneNumber("12-12-12"));
        System.out.println("Номер 12-13-12 содержится в справочнике: " + phoneBook.containsPhoneNumber("12-13-12"));

    }
}
