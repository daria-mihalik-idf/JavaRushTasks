package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("аа", "бб");
        map.put("вв", "гг");
        map.put("дд", "уу");
        map.put("жж", "зз");
        map.put("ии", "кк");
        map.put("дд", "мм");
        map.put("нн", "оо");
        map.put("пп", "рр");
        map.put("сс", "тт");
        map.put("уу", "хх");
        return map;
    }


    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int n = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name))
                n++;
        }
        return n;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int n = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName))
                n++;
        }
        return n;

    }

    public static void main(String[] args) {

    }
}


