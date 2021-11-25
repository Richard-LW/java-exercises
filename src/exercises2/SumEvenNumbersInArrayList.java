package exercises2;

import java.util.ArrayList;
import java.util.Arrays;

public class SumEvenNumbersInArrayList {
    public static void main(String[] args){
        int sumOfEvenNumbers = 0;
        int countOfEvenNumbers = 0;
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1,45,6,7,13,23,22,20,1005,2,2,8,7,6));
        for (Integer value : integerList) {
            if (value % 2 == 0) {
                sumOfEvenNumbers += value;
                countOfEvenNumbers ++;
            }
        }
        System.out.println("Original list: " + Arrays.toString(integerList.toArray()));
        System.out.println("I counted " + countOfEvenNumbers + " even numbers; \n" +
                "The sum of those even numbers is " + sumOfEvenNumbers);

    }
}
