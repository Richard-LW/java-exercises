package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        StringBuilder searchResult = new StringBuilder("The results are in - ");
        String aliceFirstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do:" +
                " once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Hello, user! This program checks if the first sentence of Alice in Wonderland contains the word you input.\n" +
                "Please enter a single word you think will be found in this sentence.");
        String searchTerm = userInput.next();
        System.out.println("Ok, having a look...");
        boolean wordFound = aliceFirstSentence.toLowerCase().contains(searchTerm.toLowerCase());
        if (wordFound) {
            searchResult.append("yes! That search term was found.");
        } else {
            searchResult.append("no! I didn't find that search term in the text.");
        }
        System.out.println(searchResult);
    }
}
