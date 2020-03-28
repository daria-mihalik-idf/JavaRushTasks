package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/*
Большая и чистая
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!


Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя name1.
4. Выведенный текст должен содержать введенное имя name2.
5. Выведенный текст должен содержать введенное имя name3.
6. Выведенный тест должен полностью соответствовать заданию.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        String name1, name2, name3;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        name1 = bufferedReader.readLine();
        name2 = bufferedReader.readLine();
        name3 = bufferedReader.readLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

    }
}