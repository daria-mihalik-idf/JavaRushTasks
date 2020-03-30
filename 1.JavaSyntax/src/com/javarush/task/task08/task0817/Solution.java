package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.List; 
import java.util.LinkedList;
import java.util.Collections;


/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("A", "B");
        hm.put("C", "D");
        hm.put("E", "F");
        hm.put("G", "I");
        hm.put("J", "K");
        hm.put("L", "M");
        hm.put("N", "O");
        hm.put("P", "Q");
        hm.put("R", "S");
        hm.put("T", "U");
        return hm;
    }

    

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        
         List<String> list = new LinkedList<>(map.values());

        for (String s : list) {
            if (Collections.frequency(map.values(), s) > 1) {
                removeItemFromMapByValue(map, s);
            }
        }
    }

    

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
