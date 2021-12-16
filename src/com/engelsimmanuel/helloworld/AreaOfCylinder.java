package com.engelsimmanuel.helloworld;

public class AreaOfCylinder {
    private final double radius;
    private final double height;

    public AreaOfCylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double calculateAreaOfCylinder(){
        double pi = 3.142;
        return (2 * pi * radius * height) + (2 * pi * Math.pow(radius, 2));
    }
}
