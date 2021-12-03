package adventOfCode;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dayTwoPartOne {
    public static void main(String[] args) {
        String fileLine;
        String directionPart;
        int valuePart;

        int depthValue = 0;
        int horizontalValue = 0;

        Pattern forward = Pattern.compile("forward");
        Pattern down = Pattern.compile("down");
        Pattern up = Pattern.compile("up");

        try {
            File directions = new File("resources/adventInputDayTwo.txt");
            Scanner fileReader = new Scanner(directions);

            while (fileReader.hasNextLine()) {
                fileLine = fileReader.nextLine().trim();

//                nope
//                int lastChar = fileLine.charAt(fileLine.length() -1);
//                System.out.println("lastChar should be an integer:" + lastChar);

                String[] words = fileLine.split("\\s");

                Boolean forwardMatchFound = false;
                Boolean downMatchFound = false;
                Boolean upMatchFound = false;

                Matcher matchForward = forward.matcher(fileLine);
                Matcher matchDown = down.matcher(fileLine);
                Matcher matchUp = up.matcher(fileLine);

                 forwardMatchFound = matchForward.find();
                 downMatchFound = matchDown.find();
                 upMatchFound = matchUp.find();


//                //working matcher:
                if(forwardMatchFound) {
                    horizontalValue += Integer.parseInt(words[1]);
                    System.out.println("forward matched from file line: " + fileLine);
                }else if (downMatchFound) {
                    depthValue += Integer.parseInt(words[1]);
                    System.out.println("down matched from file line: " + fileLine);
                } else if (upMatchFound) {
                    depthValue -= Integer.parseInt(words[1]);
                    System.out.println("up matched from file line: " + fileLine);
                }

                System.out.println(String.format("Depth is now %d, horizontal is %d ", depthValue, horizontalValue));
            }

            System.out.println("After reading in the whole file,\n" +
                    "depth = " + depthValue + ";\n" +
                    "horizontal value  = " + horizontalValue + ";\n" +
                    "values multiplied together are: " + (depthValue * horizontalValue)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
