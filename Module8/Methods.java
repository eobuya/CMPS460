package com.example.module8;

public class Methods {
    public static void main(String[] args) {

        //Vehicle Info
        String Make = "Nissan";
        String Model = "Murano";
        int Year = 2019;

        displayInfo(); //Method name

        gotSeasons("Game Of Thrones",8);

        System.out.println(productOf(10, 30) + "\n");

        VehicleTypes(Make,Model,Year);
    }

    //creating method
    public static void displayInfo() {
        System.out.println("\nHello! This is the first line to print on the console.\n");
    }

    //second method
    public static void gotSeasons(String hboSeries, int seasons) {
        System.out.println(hboSeries + " series has " + seasons + " seasons.\n");
    }

    public static int productOf(int value1, int value2) {

        int result = value1 * value2;
        return result;
    }

    public static void VehicleTypes(String Make, String Model, int Year) {
        System.out.println("Vehicle Information");
        System.out.println("Make: " + Make);
        System.out.println("Model: " + Model);
        System.out.println("Year: " + Year);
    }
}
