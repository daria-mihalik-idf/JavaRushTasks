package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() <= min) {
                min = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == min) {
                System.out.println(strings.get(i));
            }
        }
    }
}