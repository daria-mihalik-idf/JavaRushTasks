package com.javarush.task.task08.task0819;

import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
1. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> itr = cats.iterator();
        cats.remove(itr.next());
        printCats(cats);
    }


    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();

        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());

        return set;
    }

    public static void printCats(Set<Cat> cats) {
        cats.forEach(System.out::println);
    }

    public static class Cat {

    }
}