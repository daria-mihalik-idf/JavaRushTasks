package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки

Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
*/
import java.io.*;
import java.util.*;


public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        char[] n=s.toCharArray();

        for (int i=0; i<n.length; i++)
        {int x=n[i];
            if (x%2==0) even++;
            else odd++;
        }

        System.out.println("Even: "+ even +" Odd: " +odd);

    }
}
    
