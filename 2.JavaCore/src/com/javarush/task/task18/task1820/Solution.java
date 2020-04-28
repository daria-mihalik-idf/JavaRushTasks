package com.javarush.task.task18.task1820;

/* 
Округление чисел

Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения. Для второго - поток для записи.
3. Считать числа из первого файла, округлить их и записать через пробел во второй.
4. Должны соблюдаться принципы округления, указанные в задании.
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);


        StringBuilder sb = new StringBuilder();
        while (fileInputStream.available() > 0){
            sb.append(Character.toChars(fileInputStream.read()));
        }
        fileInputStream.close();

        String[] numbers = sb.toString().split(" ");
        for (String n: numbers) {
            int digit = Math.round(Float.parseFloat(n));
            fileOutputStream.write(Integer.toString(digit).getBytes());
            fileOutputStream.write((byte)' ');
        }

        fileOutputStream.close();
    }
}
