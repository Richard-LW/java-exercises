package exercises;

import java.util.Scanner;

public class HelloUser {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, friend! Please type your name, and press Enter.");
        String userName = input.next();
        System.out.println("Hello, " + userName);
    }
}
