package com.ua.main.homework9;

public class Teacher {
    private String teacherFirstName;
    private String teacherLastName;
    private String teacherSubject;

    public Teacher(String teacherFirstName, String teacherLastName, String teacherSubject) {
        this.teacherFirstName = teacherFirstName;
        this.teacherLastName = teacherLastName;
        this.teacherSubject = teacherSubject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Teacher first name='" + teacherFirstName + '\'' +
                ", teacher last name='" + teacherLastName + '\'' +
                ", teacher subject='" + teacherSubject + '\'' +
                "'}\n";
    }
}
