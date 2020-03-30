package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        
        Human son1 = new Human("a", true, 10);
        Human son2 = new Human("b", true, 20);
        Human son3 = new Human("c", true, 30);
        ArrayList<Human> list = new ArrayList<>(Arrays.asList(son1, son2, son3));
        Human father = new Human("f", true, 65, list);
        Human mother = new Human("m", false, 65, list);
        Human grandfa1 = new Human("grandfa1", true, 75, new ArrayList<>(Collections.singletonList(father)));
        Human grandfa2 = new Human("grandfa2", true, 85, new ArrayList<>(Collections.singletonList(mother)));
        Human grandma1 = new Human("grandma1", false, 60, new ArrayList<>(Collections.singletonList(father)));
        Human grandma2 = new Human("grandma2", false, 70,new ArrayList<>(Collections.singletonList(mother)));

        System.out.println(grandfa1);
        System.out.println(grandfa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
    }
    

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {

            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        
        
        
        
        
        

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
