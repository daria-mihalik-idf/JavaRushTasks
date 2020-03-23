package com.javarush.task.task12.task1208;

/* 
Свобода печати
Написать пять методов print с разными параметрами.

Требования:
1. Программа не должна выводить текст на экран.
2. Класс Solution должен содержать шесть методов.
3. Класс Solution должен содержать статический метод main().
4. Класс Solution должен содержать пять статических методов print() с разными параметрами.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static void print (int a) {
        System.out.println(a);
    }

    public static void print (char ch) {
        System.out.println(ch);
    }
    public static void print (Integer a) {
        System.out.println(a);
    }

    public static void print (boolean s) {
        System.out.println(s);
    }
    public static void print (float f) {
        System.out.println(f);
    }


}

