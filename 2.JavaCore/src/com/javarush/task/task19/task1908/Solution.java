package com.javarush.task.task19.task1908;

/* 
Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8ю 1

Результат:
12 14 1


Требования:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором принимающим FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        String fileName2 = conReader.readLine();
        conReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            String[] digital = s.split("\\s");  ;

            for (String str : digital)
                try {
                    System.out.println(Integer.parseInt(str));
                    fileWriter.write(str + " ");
                } catch (NumberFormatException e) {
                    continue;
                }
        }
        fileWriter.close();
        fileReader.close();
    }
}