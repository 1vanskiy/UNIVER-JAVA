package com.company;

public class PersonLocation {
    private String сity;
    private double coordinatesX;
    private double coordinatesY;


    public PersonLocation(String сity, double coordinatesX, double coordinatesY) {
        this.сity = сity;
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    public String getСity() {
        return сity;
    }

    public void setСity(String сity) {
        this.сity = сity;
    }

    public double getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(double coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public double getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(double coordinatesY) {
        this.coordinatesY = coordinatesY;
    }
}
