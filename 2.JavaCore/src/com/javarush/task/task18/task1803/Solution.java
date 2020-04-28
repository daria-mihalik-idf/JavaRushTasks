package com.javarush.task.task18.task1803;

/* 
Самые частые байты

Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> hm = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        while (file.available() > 0) {
            int b = file.read();
            Integer value = hm.get(b);
            hm.put(b, ((value == null)? 1 : value + 1));
        }
        file.close();

        int max = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
            if (entry.getValue() > max)
                max = entry.getValue();

        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
            if (entry.getValue() == max)
                System.out.print(entry.getKey() + " ");
    }
}