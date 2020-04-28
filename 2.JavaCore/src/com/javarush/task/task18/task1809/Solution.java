package com.javarush.task.task18.task1809;

/* 
Реверс файла

Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1name = reader.readLine();
        String file2name = reader.readLine();

        FileInputStream file1 = new FileInputStream(file1name);
        FileOutputStream file2 = new FileOutputStream(file2name);

        if (file1.available() > 0) {
            byte[] buffer = new byte[file1.available()];
            int count = file1.read(buffer);
            for (int i = 0; i < count / 2; i++) {
                byte tmp = buffer[i];
                buffer[i] = buffer[count - i - 1];
                buffer[count - i - 1] = tmp;
            }
            file2.write(buffer, 0, count);
        }
        file1.close();
        file2.close();
    }
}
