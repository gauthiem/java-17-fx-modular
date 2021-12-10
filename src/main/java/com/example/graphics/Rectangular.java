package com.example.graphics;

public class Rectangular extends Shape {
    private double width;
    private double height;

    public Rectangular(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;

    }


    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) { //solte implementiert werden
        this.height = height;
    }

    public double computeArea() {
        return (getHeight() * getWidth()); //solte implementiert werden
    }

    public double computeCircumference() {
        return ((2 * getHeight()) + (2 * getWidth()));
    }
}
