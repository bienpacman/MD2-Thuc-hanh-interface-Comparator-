package com.company;

public class Cricle {
private double radius ;
private String color = "blue";

    public Cricle() {
        this.radius = 1;
    }

    public Cricle(double radius){
}

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
