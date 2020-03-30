package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "мама", "мыла", "раму");

        for (int i = 0; i < list.size(); i += 2) {
            list.add(i+1, "именно");
        }

        for (String word : list) {
            System.out.println(word);
        }
    }
}
    
