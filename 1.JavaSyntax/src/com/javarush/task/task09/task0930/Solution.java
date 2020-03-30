package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array){
        
        ArrayList<Integer> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        
        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i])) {
                intList.add(i);
            } else {
                stringList.add(i);
            }
        }

        
        for (int i = (stringList.size() - 1); i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
               
                int num = stringList.get(j);
                int numNext = stringList.get(j + 1);
                
                if (isGreaterThan(array[num], array[numNext])) {
                    //Делаем замену
                    String tmp = array[num];
                    array[num] = array[numNext];
                    array[numNext] = tmp;
                }
            }
        }

       
        for (int i = (intList.size() - 1); i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
               
                int num = intList.get(j);
                int numNext = intList.get(j + 1);
                
                if (Integer.parseInt(array[numNext]) > Integer.parseInt(array[num])) {
                    
                    String tmp = array[num];
                    array[num] = array[numNext];
                    array[numNext] = tmp;
                }
            }
        }
    }

    public static void mySort(String[] array) {

        
        int counterW = 0;
        int counterN = 0;
        for (String s: array){
            if (isNumber(s))
                counterN++;
            else
                counterW++;
        }

       
        String[] words = new String[counterW];
        Integer[] numbers = new Integer[counterN];

        
        int n = 0;
        int w = 0;
        for (String s: array){
            if (isNumber(s)){
                numbers[n] = Integer.parseInt(s); n++;
            }
            else {
                words[w] = s;
                w++;
            }
        }

       
        for (int i=0; i<words.length; i++) {
            for (int j=0; j < words.length-1;j++) {
                if (isGreaterThan(words[j],words[j+1])){
                    String s = words[j];
                    words[j] = words[j+1];
                    words[j+1] = s;
                }
            }
        }
        
        Arrays.sort(numbers, Comparator.reverseOrder());

        
        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])){
                array[i] = Integer.toString(numbers[x]);
                x++;
            }
            else{
                array[i] = words[y];
                y++;
            }
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') 
                    || (!Character.isDigit(c) && c != '-'))
            {
                return false;
            }
        }
        return true;
    }
}