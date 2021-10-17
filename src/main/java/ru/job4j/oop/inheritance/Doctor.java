package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private boolean doctorDegree;

    public Doctor(String name, String surname, String education, String birthday, boolean degree) {
        super(name, surname, education, birthday);
        this.doctorDegree = degree;
    }
}
