package com.javarush.task.task08.task0818;

import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Aaa", 500);
        map.put("BBB", 400);
        map.put("CCC", 700);
        map.put("DDD", 800);
        map.put("EEE", 900);
        map.put("FFF", 450);
        map.put("GGG", 1100);
        map.put("JJJ", 1200);
        map.put("KKK", 1300);
        map.put("LLL", 1400);
        
        return map;
    }
        
    

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }
    

    public static void main(String[] args) {

    }
}