package com.ua.main.hw_lesson_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {

    private String fileName;

    public FileManager(String fileName) {
          this.fileName = fileName;
    }

    public void writeStringToFile(String stringToWrite) throws IOException {
        File myFile = new File(fileName);
        if (!myFile.exists()) {
            myFile.createNewFile();
            var os = new FileOutputStream(myFile, false);
            os.write(stringToWrite.getBytes());
        } else {
            var os = new FileOutputStream(myFile, true);
            os.write(stringToWrite.getBytes());
        }
    }

    public byte[] getDataFromFile() throws IOException {
        File myFile = new File(fileName);
        if (!myFile.exists()) {
            throw new IOException("File not found!");
        } else {
            var is = new FileInputStream(fileName);
            return is.readAllBytes();
        }
    }

}
