package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private int workExperience;

    public Surgeon(String name, String surname, String education, String birthday,
                   boolean degree, int workExperience) {
        super(name, surname, education, birthday, degree);
        this.workExperience = workExperience;
    }

    public void startOperation() {
    }
}
