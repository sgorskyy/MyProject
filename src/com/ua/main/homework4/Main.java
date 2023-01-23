package com.ua.main.homework4;

public class Main {
    public static void main(String[] args) {
        String TestString = "This is the string for TEST!";

        System.out.println("Original string: " + TestString);
        System.out.println("Uppercase string: " + TestString.toUpperCase());
        System.out.println("Lowercase string: " + TestString.toLowerCase());
        System.out.println("First letter of string: " + TestString.charAt(0));
        System.out.println("Last letter of string: " + TestString.charAt(TestString.length()-1));
    }
}
