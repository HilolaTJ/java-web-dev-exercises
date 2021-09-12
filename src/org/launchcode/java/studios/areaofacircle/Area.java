package org.launchcode.java.studios.areaofacircle;

// 1. Ask the user for the radius of a circle
// 2. Calculate its area
// 3. Print the result

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        // Declare class variables here
        Area area = new Area();
        area.calculateArea();
    }
    // Create Constructor here
    public Area() {
    }
    // Create other methods here
    public void calculateArea() {
        // Ask for the radius
        Scanner input = new Scanner(System.in);
        try {
            boolean keepOnLooping = true;
            while (keepOnLooping) {
                Double myUsersRadius = input.nextDouble();
                if (myUsersRadius < 0) {
                    // print an error to the user
                    // Re-prompt the user
                    System.out.println("You can not enter a negative number.");
                } else {
                    // continue as normal
                    // Calculate the area
                    Double area = Circle.getArea(myUsersRadius);
                    // Print the result
                    System.out.println(area);
                    // Tell the while loop to exit
                    keepOnLooping = false;
                }
            }
        } catch (Exception error) {
            System.out.println("You must provide a numeric input.");
        }
        // Close the scanner
        input.close();
    }
}
