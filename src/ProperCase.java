import java.util.*;

public class ProperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(properCaseInserter(sc.nextLine()));

    }
    //Method that prints a string with the given requirements from the assignment
    public static String properCaseInserter (String input) {
        //Splits the sentence into a String array
        String[] sentenceSplit = input.split(" ");
        //An arrayList is created from the sentenceSplit array
        ArrayList<String> wordHolder = new ArrayList<>(Arrays.asList(sentenceSplit));
        //String builder is a class that makes it easier to input multiple strings into a single object.
        StringBuilder sentenceToReturn = new StringBuilder();

        for (int i = 0; i < wordHolder.size(); i++) {
            //If statement that checks if the word is uppercase
            if (wordHolder.get(i) == wordHolder.get(i).toUpperCase(Locale.ROOT)) {
                //append is a function in the Stringbuilder class that mashes the string into the object.
                sentenceToReturn.append(wordHolder.get(i) + " ");
            } else {
                //if statement that use the letterCount method to count how many letters there are in the word.
                if (letterCount(wordHolder.get(i)) <= 3) {
                    wordHolder.set(i, wordHolder.get(i).toLowerCase());
                    sentenceToReturn.append(wordHolder.get(i).toLowerCase() + " ");
                }
                //Checks if the word is above 3 letters long.
                if (letterCount(wordHolder.get(i)) > 3) {
                    //Makes the starting letter of the word uppercase
                    sentenceToReturn.append(upperCaseStartLetter(wordHolder.get(i)) + " ");
                }
            }

        }

        return sentenceToReturn.toString();
    }

    //method to count letters in word
    public static int letterCount(String wordToCount) {

        return (int) wordToCount.chars().count();
    }

    //method to uppercase the first letter in the word
    public static String upperCaseStartLetter (String wordToUpCase) {

        return wordToUpCase.substring(0, 1).toUpperCase() + wordToUpCase.substring(1);
    }
}
