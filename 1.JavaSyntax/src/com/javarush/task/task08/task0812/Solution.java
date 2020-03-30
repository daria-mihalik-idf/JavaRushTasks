package com.javarush.task.task08.task0812;

import sun.awt.windows.WBufferStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();
        int temp = 1;
        int big = 1;
        for (int i = 0; i < 10; i++) {
            arr.add(i, Integer.parseInt(reader.readLine()));
        }

        for (int j = 0; j < arr.size() - 1; j++) {
            if (arr.get(j).equals(arr.get(j + 1))) {
                temp++;
            }
            if (temp > big) big = temp;

            else temp = 1;
        }

        System.out.println(big);
    }
}