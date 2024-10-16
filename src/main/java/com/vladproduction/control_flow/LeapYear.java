package com.vladproduction.control_flow;

public class LeapYear {
    public static void main(String[] args) {
//        int year = 2020; //true
        int year = 1900; //false
//        int year = 100; //false

        boolean result1 = LeapYear.isLeapYear1(year);
        boolean result2 = LeapYear.isLeapYear2(year);
        boolean result3 = LeapYear.isLeapYear3(year);
        boolean result4 = LeapYear.isLeapYear4(year);
        boolean result5 = LeapYear.isLeapYear5(year);

        //resul is true if leap year otherwise false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }

    static boolean isLeapYear1(int year) {
        if (year % 400 == 0) {
            return true; // Divisible by 400
        }
        if (year % 100 == 0) {
            return false; // Divisible by 100 but not by 400
        }
        if (year % 4 == 0) {
            return true; // Divisible by 4 but not by 100
        }
        return false; // Not a leap year
    }

    static boolean isLeapYear2(int year) {
        if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    static boolean isLeapYear3(int year) {
        if((year % 4 == 0 && year % 100 != 0) ||
           (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

    static boolean isLeapYear4(int year) {
        if((year % 4 == 0 && year % 100 != 0) ||
           (year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

    static boolean isLeapYear5(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
