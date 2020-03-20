package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];
        int[] lengths = new int[10];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
            lengths[i] = strings[i].length();
        }

        for (Integer length : lengths) {
            System.out.println(length);
        }
    }
}