package com.javarush.task.task18.task1801;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должен выводиться максимальный байт, считанный из файла.
•	Поток чтения из файла должен быть закрыт.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int b = 0;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > b)
                b = data;
        }
        inputStream.close();

        System.out.println(b);
    }
}