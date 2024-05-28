package ru.otus.java.basic.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import java.util.Objects;

public class PhoneBook {
    private Map<String, Set<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Телефонный справочник \n" +
                "Контакты: " + contacts;
    }

    public void add(String name, String phoneNumber) {
        Set<String> numbers = contacts.get(name);
        if (numbers == null) {
            numbers = new HashSet<>();
            contacts.put(name, numbers);
        }
        numbers.add(phoneNumber);
    }

    public Set<String> find(String name) {
        Set<String> numbers = contacts.get(name);
        if (numbers != null) return numbers;
        return new HashSet<>();
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (Set<String> numbers : contacts.values()) {
            if (numbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
