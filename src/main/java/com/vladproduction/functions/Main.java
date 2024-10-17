package com.vladproduction.functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome!");

        announceDevTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDevTeaTime();

        System.out.println("Promoted!");

    }

    public static void announceDevTeaTime(){
        System.out.println("Waiting for developing tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time.");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It`s developer tea time!");
    }
}
