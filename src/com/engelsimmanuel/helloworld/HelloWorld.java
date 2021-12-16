package com.engelsimmanuel.helloworld;

import java.util.Scanner;

public class HelloWorld {
    static double radius;
    static double height;

    public static void main(String[] args) {
        requestInput();
    }

    private static void requestInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder");
        radius = sc.nextDouble();

        System.out.println("Enter the height of the cylinder");
        height = sc.nextDouble();

        calculateArea();
    }

    private static void calculateArea(){
        AreaOfCylinder areaOfCylinder = new AreaOfCylinder(radius, height);
        double answer = areaOfCylinder.calculateAreaOfCylinder();

        System.out.println("The area of the cylinder is " +answer);
    }
}
