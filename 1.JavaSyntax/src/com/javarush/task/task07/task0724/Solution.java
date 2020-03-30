package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandfa1 = new Human("AA", true, 90);
        Human grandfa2 = new Human("BB", true, 74);
        Human grandma1 = new Human("CC", false, 60);
        Human grandma2 = new Human("DD", false, 70);
        Human father = new Human("EE", true, 40, grandfa1, grandma1);
        Human mother = new Human("FF", false, 38, grandfa2, grandma2);
        Human son1 = new Human("JJ", true, 20, father, mother);
        Human son2 = new Human("KK", true, 27, father, mother);
        Human son3 = new Human("LL", false, 21, father, mother);

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
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}