package com.alfa;

import com.alfa.work1.Runner;

public class Main {

    public static void main(String[] args) {

        String dir = "";
        try {
            dir = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            dir = "./";
        }
        new Runner(dir).run();
    }
}
