package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        
        printArr(sortArr(arr));

    }
    
    public static int[] sortArr(int[] arr){
        for(int j = 0; j < arr.length; j++){
            for(int k = 0; k < arr.length; k++){
                if(arr[j] > arr[k]){
                    int t = arr[j];
                    arr[j] = arr[k];
                    arr[k] = t;
                }
            }
        }
        return arr;
    }
    
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
