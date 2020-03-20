package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));                                                                                                                                                                                                                                                          
    ArrayList<String> str = new ArrayList<String>();                                                                                                                                                                                                                                                          
                                                  
        for (int i = 0; i < 8; i++) {                                                                                                                                                                                                                                                          
      String s = reader.readLine();                                                                                                                                                                                                                                                          
      str.add(0,s);                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
      }                                                        
                                                                                                                                                                                                                                                       
      for (int i = 0; i < str.size(); i++) {                                                                                                                                                                                                                                                         
      System.out.println(str.get(i));                                                                                                                                                                                                                                                          
      }                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                                                                      
    }                                                                                                                                                                                                                                                                                                            
}
