package ru.otus.java.basic.hwoop1;

public class MainApplication {
    public static void main(String[] args) {

        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1955, "ivanovii@mail.ru"),
                new User("Петров", "Иван", "Иванович", 1960, "petrovii@mail.ru"),
                new User("Сидоров", "Иван", "Иванович", 1965, "sidorovii@mail.ru"),
                new User("Смирнов", "Иван", "Иванович", 1970, "smirnovii@mail.ru"),
                new User("Макаров", "Иван", "Иванович", 1975, "makarovii@mail.ru"),
                new User("Попов", "Иван", "Иванович", 1980, "popovii@mail.ru"),
                new User("Васильев", "Иван", "Иванович", 1985, "vasilievii@mail.ru"),
                new User("Кузнецов", "Иван", "Иванович", 1990, "kuznecovii@mail.ru"),
                new User("Соколов", "Иван", "Иванович", 1995, "sokolovii@mail.ru"),
                new User("Михайлов", "Иван", "Иванович", 2000, "mihailovii@mail.ru")
        };
        for (int i = 0; i < users.length; i++) {
            if (users[i].getYearOfBirth()<(2024-40)) {
                users[i].infoUser();
                System.out.println();
            }
        }
    }
}
