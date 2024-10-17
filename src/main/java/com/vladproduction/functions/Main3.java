package com.vladproduction.functions;

public class Main3 {
    public static void main(String[] args) {

        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice);
        double individualTotalMealPrice = groupTotalMealPrice / 5; //assume for 5 persons
        System.out.println(individualTotalMealPrice);

    }

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return listedMealPrice + tip + tax;
    }

}
