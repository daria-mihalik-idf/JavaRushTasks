package com.javarush.task.task19.task1920;

/* 
Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль имена, у которых максимальная сумма.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(args[0])) {
            BufferedReader fReader = new BufferedReader(fileReader);
            Map<String, Double> map = new TreeMap<>();
            Double maxValue = Double.MIN_VALUE;

            String line;
            while ((line = fReader.readLine()) != null) {
                String[] chunks = line.split(" ");
                Double result = map.merge(chunks[0], Double.valueOf(chunks[1]), (v1, v2) -> v1 + v2);
                if (maxValue.compareTo(result) < 0) {
                    maxValue = result;
                }
            }

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (entry.getValue().compareTo(maxValue) == 0) {
                    System.out.println(entry.getKey());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}