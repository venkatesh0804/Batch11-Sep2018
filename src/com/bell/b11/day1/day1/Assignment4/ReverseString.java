package com.bell.b11.day1.day1.Assignment4;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[]args){
        String s="This is ajava class";
        String[] word=s.split(" ");
        for (int i = word.length - 1; i > -1; i--) {
            String revWord = word[i];
            String[] revLetter = revWord.split(" ");
            for (int j = revLetter.length-1; j>-1; j--) {

                System.out.println(revLetter[j]);

            }
        }

    }
}
