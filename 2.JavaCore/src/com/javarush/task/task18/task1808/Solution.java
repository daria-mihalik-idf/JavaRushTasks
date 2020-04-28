package com.javarush.task.task18.task1808;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1name = reader.readLine();
        String file2name = reader.readLine();
        String file3name = reader.readLine();

        FileInputStream file1 = new FileInputStream(file1name);
        FileOutputStream file2 = new FileOutputStream(file2name);
        FileOutputStream file3 = new FileOutputStream(file3name);

        if (file1.available() > 0) {
            byte[] buffer = new byte[file1.available()];
            int count = file1.read(buffer);
            int first = count / 2 + count % 2;
            file2.write(buffer, 0, first);
            file3.write(buffer, first, count - first);
        }

        file1.close();
        file2.close();
        file3.close();
    }
}
