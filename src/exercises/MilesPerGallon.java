package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] ars) {
        MilesPerGallon milesPerGallon = new MilesPerGallon();
        milesPerGallon.calculateMilesPerGallon();

    }

    public void calculateMilesPerGallon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double milesDriven = scanner.nextDouble();

        System.out.println("How many gallons of gas has your carconsumed?");
        Double galonsConsumed = scanner.nextDouble();

        // Miles per gallon -> miles / gallons;
        Double milesPerGallon = milesDriven / galonsConsumed;
        System.out.println("Your miles per gallon is: " + milesPerGallon.toString());

    }
}
