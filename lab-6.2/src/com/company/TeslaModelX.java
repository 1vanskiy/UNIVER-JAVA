package com.company;

public class TeslaModelX {
    public int year;
    public double weight;
    public double range;
    public double price;
    public static double maxSpeed;


    public TeslaModelX(int year, double weight, double range, double price, double maxSpeed ) {
        this.year = year;
        this.weight = weight;
        this.range = range;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public static double getMaxSpeed() {

        double a = price + range;
        return a;
    }
}
