package exercises;

import java.util.Scanner;

public class FuelConsumption {

    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello, user! I'd like to help calculate how much fuel you used.\n" +
                "Please input how many miles you have driven:");
        double milesDriven = userInput.nextDouble();
        System.out.println("OK, now please input the amount of fuel you used, in gallons:");
        double gallonsUsed = userInput.nextDouble();
        System.out.println("Given those figures, the fuel consumption in miles per gallon is " + milesDriven / gallonsUsed);
    }
}
