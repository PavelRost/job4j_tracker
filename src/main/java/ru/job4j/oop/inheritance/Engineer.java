package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private boolean engineerDegree;
    private int workExperience;

    public Engineer(boolean engineerDegree, int workExperience) {
        super();
        this.engineerDegree = engineerDegree;
        this.workExperience = workExperience;
    }
}
