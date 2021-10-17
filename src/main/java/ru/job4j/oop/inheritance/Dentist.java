package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private int workExperience;

    public Dentist(String name, String surname, String education, String birthday,
                   boolean degree, int workExperience) {
        super(name, surname, education, birthday, degree);
        this.workExperience = workExperience;
    }

    public void startConsultation() {

    }

}
