package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args){
        // What data types should the dimensions be?
        // 2, 5, 1000, 10000, 0.1, 2.7653
        // strings, characters, integers, doubles
        // Doubles - Hold our value!
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();
    }

    public void calculateAreaOfRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Double myRectangleLength = scanner.nextDouble();
        System.out.println("What is the width of the rectangle?");
        Double myRectangleWidth = scanner.nextDouble();

        // Area = width * length
        Double area = myRectangleWidth * myRectangleLength;
        System.out.println("Your area is: " + area.toString());
    }

}
