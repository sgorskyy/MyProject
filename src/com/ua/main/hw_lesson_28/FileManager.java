package com.ua.main.hw_lesson_28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.APPEND;

public class FileManager {
    private final String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    public void writeStringToFile(String stringToWrite) throws IOException {
        if(Files.notExists(Path.of(fileName))) Files.createFile(Path.of(fileName));
        Files.write(Path.of(fileName),stringToWrite.getBytes(),APPEND);
    }

    public byte[] getDataFromFile() throws IOException {
        if(Files.notExists(Path.of(fileName))) throw new IOException("File not found by NIO!");
        return Files.readAllBytes(Path.of(fileName));
    }

}
