package com.vladproduction.classes;

public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        //using instance methods:
        double triangleAArea = triangleA.findArea();
        double triangleBArea = triangleB.findArea();

        System.out.println("triangleAArea = " + triangleAArea);
        System.out.println("triangleBArea = " + triangleBArea);

        //using static method (belong to the wool class);
        //not need to create instance, just class name + '.' + 'staticMethod':
        Triangle.staticMethod();

        //using instance variables (access by '.' operator):
        System.out.println(triangleA.side1);
        System.out.println(triangleA.side2);
        System.out.println(triangleA.side3);

        //but static variable holds value for wool class to use (not for the only instance);
        //do not change per instance;
        //access with the '.' dot operator using the class name (example: Triangle.numOfSides)
        System.out.println(Triangle.numOfSides);
    }
}
