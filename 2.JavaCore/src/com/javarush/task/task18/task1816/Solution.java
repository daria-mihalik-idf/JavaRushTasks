package com.javarush.task.task18.task1816;

/* 
Английские буквы

В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.

Требования:
•	Считывать с консоли ничего не нужно.
•	Создай поток чтения из файла, который приходит первым параметром в main.
•	В файле необходимо посчитать буквы английского алфавита и вывести это число в консоль.
•	Нужно учитывать заглавные и строчные буквы.
•	Поток чтения из файла должен быть закрыт.
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        FileReader fileReader = new FileReader(filename);
        int EngCounter = 0;
        while (fileReader.ready()) {
            char c = (char) fileReader.read();
            if (String.valueOf(c).matches("[a-zA-Z]"))
                EngCounter++;
        }
        System.out.println(EngCounter);
        fileReader.close();
    }
}
