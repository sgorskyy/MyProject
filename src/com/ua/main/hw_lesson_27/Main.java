package com.ua.main.hw_lesson_27;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileManager fm = new FileManager("test.txt");

        try {
            fm.writeStringToFile("I try\n");
            fm.writeStringToFile("to write\n");
            fm.writeStringToFile("into test file\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            byte[] data = fm.getDataFromFile();
            for (byte d:data) System.out.print((char)d);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
