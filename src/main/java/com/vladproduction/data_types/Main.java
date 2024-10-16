package com.vladproduction.data_types;

public class Main {
    public static void main(String[] args) {

        //data types:
        int age = 17;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;

        //String:
        String firstName = "John";
        String lastName = "Doe";
        char firstInitialLetter = 'J';
        char firstInitialLetterByCharAt = firstName.charAt(0);
        char lastInitialLetter = 'D';
        char lastInitialLetterByCharAt = lastName.charAt(0);

        System.out.println(age);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendance);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstInitialLetter);
        System.out.println(lastInitialLetter);

        System.out.println(firstInitialLetterByCharAt);
        System.out.println(lastInitialLetterByCharAt);
        System.out.println("------");
        System.out.print(firstName.charAt(0));
        System.out.print(firstName.charAt(1));
        System.out.print(firstName.charAt(2));
        System.out.print(firstName.charAt(3));

        System.out.println("-----");
        System.out.println(firstName + " " + lastName + " GPA: " + studentGPA);


    }
}
