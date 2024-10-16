package com.vladproduction.control_flow;

import java.util.Scanner;

public class MainInElse {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int inputNum = input.nextInt();
        if(inputNum < 5){
            System.out.println("input num is less then '5'");
        }
        else {
            System.out.println("input num is greater then '5'");
        }
    }
}
