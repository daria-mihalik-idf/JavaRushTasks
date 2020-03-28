package com.javarush.task.task04.task0424;

/* 
Три числа
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        
        int nA = Integer.parseInt(reader.readLine());
        int nB = Integer.parseInt(reader.readLine());
        int nC = Integer.parseInt(reader.readLine());

        if (nA == nB){
            System.out.println(3);
        } else if (nC == nB){
            System.out.println(1);
        } else if (nC == nA){
            System.out.println(2);
        }
    }
    
}
