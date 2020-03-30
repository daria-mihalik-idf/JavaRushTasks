package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        //напишите тут ваш код
            String[] subStr = str.split("\\b");
            for (int i = 0; i < subStr.length; i++) {
                System.out.print(subStr[i].substring(0, 1).toUpperCase() + subStr[i].substring(1) + " ");
            }

        }
    }