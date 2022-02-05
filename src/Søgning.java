import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Søgning {
    public static void main(String[] args) {
        boolean validation = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> predeterminedWords = new ArrayList<>();
        predeterminedWords.add("word");
        predeterminedWords.add("train");
        predeterminedWords.add("buss");
        predeterminedWords.add("phone");
        predeterminedWords.add("glass");

        do {
            String currentWord = sc.nextLine();
            if (elementChecker(predeterminedWords, currentWord) == -1) {
                throw new IllegalArgumentException("Word is not in the ArrayList");
            } else {
                System.out.println(elementChecker(predeterminedWords, currentWord));
            }


        } while (validation);

    }

    public static int elementChecker (ArrayList<String> listOfStrings, String input) {
        boolean isWordInList = false;
        int wordInListIndex = 0;
        int indeksposition = -1;

        for (int i = 0; i < listOfStrings.size(); i++) {
            String currentWord = listOfStrings.get(i);
            if (Objects.equals(currentWord, input)) {
                isWordInList = true;
                wordInListIndex = i;
            } else {
                indeksposition = -1;
            }

        }
        if (isWordInList) {
            return wordInListIndex;
        } else {
            return indeksposition;
        }
    }

}
