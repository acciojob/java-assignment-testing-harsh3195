package com.driver;

import java.util.*;

public class Main {

    public static String func(int N){
        String s = "";
        boolean toggle = false;
        
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        Queue<Character> q = new LinkedList();
        
        for(int i=0; i<alphabets.length; i++)
            q.add(alphabets[i]);
        
        while(N > 0) {
            char ch = q.remove();
            if (toggle)
                s = s + ch;
            else
                s = ch + s;
            
            toggle = !toggle;
            
            q.add(ch);
            N = N-1;
        }
        
        return s;
    }

    public static void main(String[] args) {
        //your code here
         Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
        String s = "";
        boolean toggle = false;
        
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        Queue<Character> q = new LinkedList();
        
        for(int i=0; i<alphabets.length; i++)
            q.add(alphabets[i]);
        
        while(N > 0) {
            char ch = q.remove();
            if (toggle)
                s = s + ch;
            else
                s = ch + s;
            
            toggle = !toggle;
            
            q.add(ch);
            N = N-1;
        }
        System.out.println(s);

    }
}
