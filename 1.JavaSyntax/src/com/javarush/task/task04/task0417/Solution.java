package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/*
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
 */


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int nA = Integer.parseInt(sA);
        int nB = Integer.parseInt(sB);
        int nC = Integer.parseInt(sC);
        
        if (nA == nB && nA == nC) {
            System.out.println(nA + " " + nB + " " + nC);
        } else if (nA == nB){
            System.out.println(nA + " " + nB);
        } else if (nB == nC){
            System.out.println(nB + " " + nC);
        } else if (nA == nC){
            System.out.println(nA + " " + nC);
        }
    }
}