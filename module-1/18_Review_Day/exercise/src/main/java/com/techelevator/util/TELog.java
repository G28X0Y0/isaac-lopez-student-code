package com.techelevator.util;

import java.io.*;
import java.sql.Timestamp;
import java.util.Scanner;

public class TELog {

    public static void log(String message) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        File log = new File("logs/search.log");
       if(!log.exists()){
           try {
               log.createNewFile();
           } catch (IOException e) {
               System.out.println("Failed to create new file!");;
           }
       }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(log, true);
            PrintWriter writer = new PrintWriter(fileOutputStream);
            writer.append("\n" + timestamp + " --- " + message);
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println(log.getName() + " not found!");
        }
    }
}
