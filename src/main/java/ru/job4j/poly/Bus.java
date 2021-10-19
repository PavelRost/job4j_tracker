package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Автобус поехал.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров в автобусе: " + count);
    }

    @Override
    public double refuel(int count) {
        return count;
    }
}
