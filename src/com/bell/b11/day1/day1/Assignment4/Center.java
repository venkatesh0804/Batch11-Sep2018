package com.bell.b11.day1.day1.Assignment4;

public class Center {
    public static void main(String[] args) {

        String s = "This is a java class";
        char midchar=s.charAt(s.length()/2);
        String[] word = s.split(" ");
        System.out.println(midchar);
    }
}