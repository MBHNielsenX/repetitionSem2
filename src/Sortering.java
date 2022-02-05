import java.util.*;

public class Sortering {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 words. Each word must be followed by an enter ");
        System.out.println();
        ArrayList<String> wordList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String currentWord = sc.next();
            wordList.add(currentWord);
        }

        System.out.println(reverseAlphOrder(wordList));

    }

    public static String reverseAlphOrder(ArrayList<String> input) {
        StringBuilder reverseOrder = new StringBuilder();
        input.sort(Collections.reverseOrder());

        for (int i = 0; i < input.size(); i++) {
            reverseOrder.append(input.get(i)).append(" ");
        }

        return reverseOrder.toString();
    }
}
