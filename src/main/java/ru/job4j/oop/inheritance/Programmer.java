package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(String name, String surname, String education, String birthday,
                      boolean degree, String programmingLanguage) {
        super(name, surname, education, birthday, degree);
        this.programmingLanguage = programmingLanguage;
    }

    public void createProgram() {
    }
}
