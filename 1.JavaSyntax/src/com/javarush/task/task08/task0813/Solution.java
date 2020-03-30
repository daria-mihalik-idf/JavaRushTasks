package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        String[] data = {"Лавр", "Лабиринт", "Логин", "Лето", "Летим", "Ленд", "Лорд", "Лак", "Лакмусааа", "Лекарство", "Лакмус", "Лотус", "Лакирование", "Логирование", "Логика", "Логичноть", "Ловкость", "Ламанш", "Лондон", "Лото"};
        Set<String> list = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            list.add(data[i]);
        }

        return list;
    }


    public static void main(String[] args) {

    }
}
