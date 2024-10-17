package com.vladproduction.functions;

public class Main5 {
    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "aAbBcCdD";
        String s3 = "Hello1World";
        String result1 = Main5.moveCapitalLettersToFront(s1);
        System.out.println("result1 = " + result1);
        String result2 = Main5.moveCapitalLettersToFront(s2);
        System.out.println("result2 = " + result2);
        String result3 = Main5.moveCapitalLettersToFront(s3);
        System.out.println("result3 = " + result3);

        System.out.println("---");
        //version2:
        String result4 = Main5.moveCapitalLettersToFront2(s1);
        System.out.println("result4 = " + result4);
        String result5 = Main5.moveCapitalLettersToFront2(s2);
        System.out.println("result5 = " + result5);
        String result6 = Main5.moveCapitalLettersToFront2(s3);
        System.out.println("result6 = " + result6);


    }


    static String moveCapitalLettersToFront(String s) {
        StringBuilder resultUpper = new StringBuilder();
        StringBuilder resultLower = new StringBuilder();
        for (char letter : s.toCharArray()) {
            if(Character.isUpperCase(letter)){
                resultUpper.append(letter);
            } else {
                resultLower.append(letter);
            }
        }
        return resultUpper.append(resultLower).toString();
    }

    static String moveCapitalLettersToFront2(String s) {
        StringBuilder result = new StringBuilder();
        int capitalIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                result.insert(capitalIndex++, ch);
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
