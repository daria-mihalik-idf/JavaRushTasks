package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        
        System.out.println(minfromArr(arr));

    }
    
    public static int minfromArr(int[] arr){
        int min = arr[0];
        for(int j = 0; j < arr.length; j++){
            if (arr[j] > min) {
                min = arr[j];
            }
            
        }
        return min;
    }
    
}
