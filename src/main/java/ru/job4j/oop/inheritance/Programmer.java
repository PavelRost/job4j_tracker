package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(boolean engineerDegree, int workExperience, String language) {
        super(engineerDegree, workExperience);
        programmingLanguage = language;
    }

    public void createProgram() {
    }
}
