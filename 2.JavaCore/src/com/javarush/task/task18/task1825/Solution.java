package com.javarush.task.task18.task1825;

/* 
Собираем файл
Собираем файл
Собираем файл из кусочков.
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.

Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].

Например, Lion.avi.

В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки.


Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "end".
2. Создай поток для записи в файл без суффикса [.partN] в папке, где находятся все считанные файлы.
3. В новый файл перепиши все байты из файлов-частей *.partN.
4. Чтение и запись должны происходить с использованием буфера.
5. Созданные для файлов потоки должны быть закрыты.
6. Не используй статические переменные.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String currentFile = "";
        String directory = "";
        String fileName = "";


        while (!"end".equals(currentFile = reader.readLine()))
            list.add(currentFile);

        reader.close();
        Collections.sort(list);

        int lastIndexDirectory = list.get(0).lastIndexOf('/');
        int lastIndexFileName = list.get(0).lastIndexOf('.');

        directory = list.get(0).subSequence(0, lastIndexDirectory+1).toString();
        fileName = list.get(0).subSequence(lastIndexDirectory+1, lastIndexFileName).toString();

        FileOutputStream fos = new FileOutputStream(directory+fileName);
        if (!new File(directory+fileName).exists())
            new File(directory+fileName).createNewFile();

        for (String s: list ){
            FileInputStream fis = new FileInputStream(s);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            fos.write(buffer);
        }
        fos.close();
    }
}