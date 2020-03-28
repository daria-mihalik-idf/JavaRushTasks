package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        arr = sortArr(arr);
        System.out.println(arr[1]);

    }

    public static int[] sortArr(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[j] > arr[k]) {
                    int t = arr[j];
                    arr[j] = arr[k];
                    arr[k] = t;
                }
            }
        }
        return arr;
    }
}
