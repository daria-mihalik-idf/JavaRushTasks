package com.javarush.task.task08.task0822;

import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.InputStreamReader;

/* 
Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.


*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        int min=array.get(0);
        for (int i=0; i<array.size();i++)
        {
            if (array.get(i)<min)
                min=array.get(i);
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        for (int i=0; i<n;i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        return list;
    }
}