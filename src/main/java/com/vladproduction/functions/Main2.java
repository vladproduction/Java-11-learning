package com.vladproduction.functions;

public class Main2 {
    public static void main(String[] args) {

        calculateTotalMealPrice(15, .2, .08);
        calculateTotalMealPrice(25, .18, .08);
    }

    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Total meal price is: " + result);
    }
}
