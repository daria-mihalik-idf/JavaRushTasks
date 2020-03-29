package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/
import java.util.Date;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        
    Date date = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd MM yyyy");
    System.out.println(formatForDateNow.format(date));
    }
}
