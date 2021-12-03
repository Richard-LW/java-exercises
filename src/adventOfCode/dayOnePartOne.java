package adventOfCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayOnePartOne {

    public static void main(String[] args) {
        int lastValue = 0;
        int countIfGreater = -1;
        int counter = 0;

        try {
            File inputValues = new File("resources/adventInput.txt");
            Scanner fileReader = new Scanner(inputValues);
            while (fileReader.hasNextLine()) {
                counter++;
                int thisValue = Integer.parseInt(fileReader.nextLine());
                if (thisValue > lastValue) {
                    countIfGreater++;
                }
                lastValue = thisValue;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(String.format("Sorry, file was not found"));
        }

        System.out.println(String.format("The number of times the value in the file was greater than the previous value was %d;\n" +
                "The total count of lines was %d",countIfGreater, counter));

    }
}
