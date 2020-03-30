package com.javarush.task.task08.task0827;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


*/
import java.util.Date;


public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date current = new Date(date); 
        Date newgood = new Date(current.getYear(), 0, 0);
        Date diff = new Date(current.getTime() - newgood.getTime());
        if ((diff.getTime() / 1000) / (86400) % 2 == 0) {
            return false; 
        } else {
            return true; 
        }
    }
}



