package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));  
        
        int [] list = new int[10];                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        for (int i = 0; i < list.length; i++) {                                                                                                                                                                                                                                                                                                                                                                                                                 
        String s = read.readLine();                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        list[i] = Integer.parseInt(s);   
    }
    
     for (int x = list.length - 1; x >= 0; x--) {
        System.out.println(list[x]);
        }
    }
    
}

