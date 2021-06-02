package com.alfa.work2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Runner {

    public static void main(String[] args) {

        String dir = "";
        try {
            dir = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        }

        try {
            System.out.println(Files.readAllLines(Paths.get(dir)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
