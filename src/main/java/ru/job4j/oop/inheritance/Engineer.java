package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private boolean engineerDegree;

    public Engineer(String name, String surname, String education, String birthday,
                    boolean degree) {
        super(name, surname, education, birthday);
        this.engineerDegree = degree;
    }
}
