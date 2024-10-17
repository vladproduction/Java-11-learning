package com.vladproduction.debugging;

public class MainTruncate {
    public static void main(String[] args) {

        String s = "This is a sample string";
        int maxLength = 3; //begin 0, end 100, length 23
        String result = MainTruncate.truncate(s, maxLength);
        System.out.println(result);

    }

    private static String truncate(String s, int maxLength) {
        String result;

        // to avoid StringIndexOutOfBoundsException (using Math.min(int begin, int end) )
        result = s.substring(0, Math.min(s.length(), maxLength));

        return result;
    }
}
