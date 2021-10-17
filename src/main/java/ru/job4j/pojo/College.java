package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setLastName("Ivanov");
        student1.setFirstName("Alexey");
        student1.setPatronymic("Olegovich");
        student1.setStudyGroup("VK-01");
        student1.setDateAdmission(LocalDate.now());
        System.out.println("Учащийся " + student1.getLastName() + " "
                + student1.getFirstName() + " "
                + student1.getPatronymic() + " "
                + "определен в группу: " + student1.getStudyGroup()
                + ". Дата поступления: " + student1.getDateAdmission() + ".");
    }
}
