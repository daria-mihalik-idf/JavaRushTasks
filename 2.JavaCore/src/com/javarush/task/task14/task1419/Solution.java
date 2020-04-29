package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.


Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.*/



public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        try {
            int num[] = new int[3];
            System.out.println(num[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            int[] a = new int[-1];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        try {
            String str = "Java";
            char c = str.charAt(4);
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            Object x = new Integer(0);
            String s = (String) x;
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            int num = Integer.parseInt("qwe");
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            FileReader fr = new FileReader(new File("undefined.txt"));
        } catch (IOException e) {
            exceptions.add(e);
        }
        try {
            Class<?> aClass = Class.forName("");
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }
    }
}