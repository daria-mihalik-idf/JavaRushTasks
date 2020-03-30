package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        
        int a = 0;
        String name = "";
        while (true) {
            try {
                a = Integer.parseInt(reader.readLine());
                name = reader.readLine();
                map.put(name, a);
            } catch (NumberFormatException e) {
                break;
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet())
            System.out.println(pair.getValue() + " " + pair.getKey());
    }
}

        