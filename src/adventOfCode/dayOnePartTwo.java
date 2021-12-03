package adventOfCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayOnePartTwo {

    public static void main(String[] args) {
        int retrievedValue = 0;
        int valueA = 0;
        int valueB = 0;
        int valueC = 0;

        int sumOfLastThree = 0;
        int sumOfCurrentThree =0;

        int countIfGreater = 0;
        int countValues = 0;

        try {

            File inputValues = new File("resources/adventInput.txt");
            Scanner fileReader = new Scanner(inputValues);

//            just read in the first three values
            for (int i = 0; i < 3; i++){
                retrievedValue = Integer.parseInt(fileReader.nextLine());
                countValues++;

                valueC = valueB;
                valueB = valueA;
                valueA = retrievedValue;
                }

            while (fileReader.hasNextLine()) {
                sumOfLastThree = valueA + valueB + valueC;
                countValues++;

                valueC = valueB;
                valueB = valueA;
                valueA = Integer.parseInt(fileReader.nextLine());

                sumOfCurrentThree = valueA + valueB + valueC;

                if (sumOfCurrentThree > sumOfLastThree) {
                    countIfGreater++;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(String.format("Sorry, file was not found"));
        }

        System.out.println(String.format("The number of times the 3 combined values in the file were greater than the previous 3 values was %d;\n" +
                "The total count of lines was %d",countIfGreater, countValues));

    }
}
