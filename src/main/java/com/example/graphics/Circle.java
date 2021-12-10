package com.example.graphics;

public class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea(){
        return Math.PI*(radius*radius);
    }

    public double computeCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
