package com.ua.main.hw_lesson_14;

public class Teacher extends UnitOfUniversity {
    private String subject;
    private String degree;

    public Teacher(String name, String subject, String degree) {
        this.name = name;
        this.subject = subject;
        this.degree = degree;
    }

    @Override
    public String getUnitInfo() {
        return "Teacher" +
                "\nName: \t\t" + name +
                "\nSubject: \t" + subject +
                "\nDegree: \t" + degree + "\n";
    }


}
