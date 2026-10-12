package com.w3resource.strings;

/**
 * Exercise 99: Even Index Characters Only
 * Write a Java program to return an updated string using every character of even position from a given string.
 */
public class Tarea11_099 {
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("The given string is: " + str);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            sb.append(str.charAt(i));
        }
        System.out.println("The new string is: " + sb.toString());
    }
}
