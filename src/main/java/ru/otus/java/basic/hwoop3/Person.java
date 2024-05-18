package ru.otus.java.basic.hwoop3;

public class Person {
    private String name;
    private Transport currentTransport;

    public Person(String name) {
        this.name = name;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    //человек садится на транспорт
    public void getOnTransport(Transport transport) {
        if (currentTransport == null) {
            this.currentTransport = transport;
            System.out.println(name + " сел на " + transport.getClass().getSimpleName());
        } else {
            System.out.println("Необходимо слезть с " + currentTransport.getClass().getSimpleName());
        }
    }

    //человек слезает с транспорта
    public void getOffTransport() {
        if (currentTransport != null) {
            System.out.println(name + " слез с " + currentTransport.getClass().getSimpleName());
            currentTransport = null;
        } else {
            System.out.println(name + " не на транспорте");
        }
    }

    // человек перемещается на расстояние
    public boolean move(Area area, int distance) {
        if (currentTransport != null) {
            return currentTransport.move(area, distance);
        } else {
            System.out.println(name + " идет пешком на расстояние " + distance + " км по местности " + area);
            return true;
        }
    }
}
