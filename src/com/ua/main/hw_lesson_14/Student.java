package com.ua.main.hw_lesson_14;

public class Student extends UnitOfUniversity {

    private String nameOfFaculty;
    private String nameOfGroup;
    private int numberOfCourse;


    public Student(String name, String nameOfFaculty, String nameOfGroup, int numberOfCourse) {
        this.name = name;
        this.nameOfFaculty = nameOfFaculty;
        this.nameOfGroup = nameOfGroup;
        this.numberOfCourse = numberOfCourse;
    }

    @Override
    public String getUnitInfo() {

        return  "Student"+
                "\nName: \t\t" + name +
                "\nFaculty: \t" + nameOfFaculty +
                "\nGroup: \t\t" + nameOfGroup +
                "\nCourse: \t" + numberOfCourse + "\n";
    }
}
