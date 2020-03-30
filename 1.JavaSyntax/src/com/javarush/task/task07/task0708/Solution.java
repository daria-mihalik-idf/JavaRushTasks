package com.javarush.task.task07.task0708;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        strings = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(i, s);
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();

            }
        }

        for (String string : strings) {
            if (max == string.length()) {
                System.out.println(string);
            }

        }

    }
}