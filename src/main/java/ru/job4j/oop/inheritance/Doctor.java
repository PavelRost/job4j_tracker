package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private boolean doctorDegree;
    private int workExperience;

    public Doctor(boolean doctorDegree, int workExperience) {
        super();
        this.doctorDegree = doctorDegree;
        this.workExperience = workExperience;
    }
}
