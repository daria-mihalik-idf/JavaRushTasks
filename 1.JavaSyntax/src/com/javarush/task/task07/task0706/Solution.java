package com.javarush.task.task07.task0706;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int even = 0, odd = 0;
        int[] houseArray = new int[15];

        for (int i = 0; i < houseArray.length; i++) {
            houseArray[i] = Integer.parseInt(reader.readLine());
            if (houseArray[i] % 2 == 0) {
                even = even + houseArray[i];
            }
            else {
                odd = odd + houseArray[i];
            }
        }

        if (even < odd) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}


