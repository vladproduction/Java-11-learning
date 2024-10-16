package com.vladproduction.data_types;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        double studentGPA = 3.45;
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName + "; GPA: " + studentGPA);
        System.out.println("What to update?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(firstName + " " + lastName + "; GPA updated: " + studentGPA);

    }
}
