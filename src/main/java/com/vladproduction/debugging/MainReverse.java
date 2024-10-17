package com.vladproduction.debugging;

public class MainReverse {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverse(s));
    }
    static String reverse(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1 ; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}
