package com.vladproduction.classes;

public class Triangle {

    static int numOfSides = 3;

    double base;
    double height;
    double side1;
    double side2;
    double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //static method (no instance needed)
    public static void staticMethod() {
        System.out.println("This is static method for " + Triangle.class.getSimpleName());
        System.out.println("Sides has: " + numOfSides);
    }

    //instance method (have to use instance of the class to call this method)
    public double findArea(){
        return (this.base * this.height) / 2;
    }
}
