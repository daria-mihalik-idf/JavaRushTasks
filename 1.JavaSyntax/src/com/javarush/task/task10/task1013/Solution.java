package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String firstname;
        private String lastname;
        private int age;
        private String address;
        private int phone;
        private String sex;

        public Human(String name)
        {
            this.firstname = name;
        }

        public Human(String name, String surname)
        {
            this.firstname = name;
            this.lastname = surname;
        }

        public Human(String name, String surname, int age)
        {
            this.firstname = name;
            this.lastname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, String address)
        {
            this.firstname = name;
            this.lastname = surname;
            this.age = age;
            this.address = address;
        }

        public Human(String name, String surname, int age, String address, int phone)
        {
            this.firstname = name;
            this.lastname = surname;
            this.age = age;
            this.address = address;
            this.phone = phone;
        }

        public Human(String name, String surname, int age, String address, int phone, String car)
        {
            this.firstname = name;
            this.lastname = surname;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.sex = car;
        }

        public Human(String surname, int age)
        {
            this.lastname = surname;
            this.age = age;
        }

        public Human(String surname, int age, String address)
        {
            this.lastname = surname;
            this.age = age;
            this.address = address;
        }

        public Human(String surname, int age, String address, int phone)
        {
            this.lastname = surname;
            this.age = age;
            this.address = address;
            this.phone = phone;
        }

        public Human(String surname, int age, String address, int phone, String car)
        {
            this.lastname = surname;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.sex = car;
        }
    }
}

