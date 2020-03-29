package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = "";
        int sum = 0;
        int b = 0;

        while (!a.equals("сумма")) {
            a =  br.readLine();
            try {
                b = Integer.parseInt(a);
                sum += b;
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(sum);

    }
}
