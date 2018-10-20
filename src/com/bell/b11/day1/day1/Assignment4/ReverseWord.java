package com.bell.b11.day1.day1.Assignment4;

 public  class ReverseWord {
    public static void main(String[] args) {
        System.out.println(Formatter.reverseWord("my name is Venkat"));
        System.out.println(Formatter.reverseWord("Iam came to usa"));
    }
}

class Formatter {
    public static String reverseWord(String str) {
        String words[] = str.split(" ");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        return reverseWord.trim();
    }
}