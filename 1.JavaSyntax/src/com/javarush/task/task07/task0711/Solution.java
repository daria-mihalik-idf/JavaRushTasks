package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0;i<5;i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i=0; i<13; i++) {
            list.add(0, list.remove(4));
        }
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}



