package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.


Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число1.
5. Выведенный текст должен содержать введенное число2.
6. Выведенный текст должен полностью соответствовать заданию.*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

        public class Solution {
            public static void main(String[] args) throws Exception {

                InputStream inputStream = System.in;
                Reader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String name = bufferedReader.readLine();
                String number1 = bufferedReader.readLine();
                String number2 = bufferedReader.readLine();
                System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");


            }
        }


    }
}
