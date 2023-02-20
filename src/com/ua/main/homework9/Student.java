package com.ua.main.homework9;

public class Student {
    private String studentName;
    private int studentAge;
    private String studentGroup;

    public Student() {
    }

    public Student(String studentName, int studentAge, String studentGroup) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGroup = studentGroup;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }
}
