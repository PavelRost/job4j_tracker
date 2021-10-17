package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private int workExperience;

    public Builder(String name, String surname, String education, String birthday,
                   boolean degree, int workExperience) {
        super(name, surname, education, birthday, degree);
        this.workExperience = workExperience;
    }

    public void startBuild() {
    }
}
