package com.javarush.task.task06.task0610;

/* 
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));                                                  
        String readString = reader.readLine();                                                  
           return readString ;

    }

    public static int readInt() throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));                                                  
            int a = Integer.parseInt(reader.readLine());                                                   
             return a;  
    }

    public static double readDouble() throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));                                                  
        double i = Double.parseDouble(reader.readLine()) ;                                                  
        return i;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));                                                  
         boolean s = Boolean.parseBoolean(reader.readLine());                                                                                           
          return s; 

    }

    public static void main(String[] args) throws Exception {

    }
}
