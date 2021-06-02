package com.alfa.work1;

import java.io.*;
import java.util.Arrays;


public class Runner {

    String dir;

    public Runner(String dir) {
        this.dir = dir;
    }

    public void run() {



        File file = new File(dir);
//        boolean isDirectory = file.isDirectory();
//        System.out.println(isDirectory);
        System.out.println(Arrays.toString(file.listFiles()));


    }
}
