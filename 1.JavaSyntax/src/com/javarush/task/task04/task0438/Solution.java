package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).


Требования:
1. Программа не должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить горизонтальную линию из 10 восьмёрок.
4. Программа должна выводить вертикальную линию из 10 восьмёрок.
5. В программе должен использоваться цикл for.*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];

        for (int i = 0; i < 8; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        for (int i = list.length; i > 0; i--)
            System.out.println(list[i]);
    }
}