package exercises;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello, user! This program calculates area of a rectangle. \n"  +
                "Please enter height of the rectangle (as a whole number):");

        int rectangleHeight = userInput.nextInt();

        System.out.println("OK. Now please enter width of the rectangle (again, as a whole number):");

        int rectangleWidth = userInput.nextInt();

        System.out.println("Splendid! Area of your rectangle " + rectangleHeight + " by " + rectangleWidth + " is: \n" +
                rectangleHeight * rectangleWidth);
    }
}
