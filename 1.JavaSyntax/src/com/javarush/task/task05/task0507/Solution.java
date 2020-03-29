package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int iter = 0;

        while (true) {
            int num = Integer.parseInt(reader.readLine());
            if (num == -1) {
                break;
            }
            iter++;
            sum += num;
            
        }
        System.out.println(sum / iter);
    }
}

