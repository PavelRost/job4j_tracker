package ru.job4j.poly;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle autobus = new Autobus();
        Vehicle[] vehicles = new Vehicle[] {airplane, train, autobus};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
