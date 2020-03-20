package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<String>();  
        
        list.add("ttt");
        list.add("ddd");
        list.add("rrr");
        list.add("fff");
        list.add("sss");
        
        System.out.println(list.size());
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
             }
    }
}

        
