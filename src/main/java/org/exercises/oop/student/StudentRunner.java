package org.exercises.oop.student;

public class StudentRunner {
    public static void main(String[] args) {
        Student stud = new Student("Иван", "Иванов", "А1", 4.5);
        Student asp = new Aspirant("Анна", "Янова", "В2", 5.0,
                "Научная работа");
        Student[] students = {stud, asp};
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " - сумма стипендии: "
                    + student.getScholarship());
        }
    }
}