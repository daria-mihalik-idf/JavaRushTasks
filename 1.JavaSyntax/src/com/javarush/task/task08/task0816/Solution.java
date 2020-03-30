package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Date;
import java.util.Locale;
import java.util.HashMap;
/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Сталлоне2", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне10", dateFormat.parse("MAY 1 2012"));
        
        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
         Map<String, Date> a = new HashMap<>(map);
    for (Map.Entry<String, Date> b : a.entrySet()) {
        int month = b.getValue().getMonth();
        if (month > 4 && month < 8) {
            map.remove(b.getKey());
        }
    }
}


    public static void main(String[] args) {

    }
}
