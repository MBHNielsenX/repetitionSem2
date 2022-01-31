import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListM {
    public static ArrayList<String> teacherNames = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean infinity = true;
        teacherNames.add("Ole");
        teacherNames.add("Jens");
        teacherNames.add("Ida");
        teacherNames.add("Jørgen");
        teacherNames.add("Mikkel");
        teacherNames.add("Niklas");
        teacherNames.add("Nicklas");
        teacherNames.add("Sammuel");
        teacherNames.add("Timmie");





        do {
            System.out.println("Please type in a name to see if it is in the arrayList ");
            if (doesArraylistContainString(teacherNames, sc.nextLine())) {
                System.out.println();
                System.out.println("The String has been found");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("The String has not been found but it has been added to the arrayList");
                System.out.println();
            }
            System.out.println();
            System.out.println("Type 1 to continue writing names or 0 to display the list of names");
            System.out.println();
            int oneOrZero = getIntInput();
            if (oneOrZero == 0) {
                for (int i = 0; i < teacherNames.size(); i++) {
                    System.out.println(teacherNames.get(i));
                }
                System.out.println();
            }

        } while (infinity);
    }
    public static int getIntInput () {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
    public static boolean doesArraylistContainString (ArrayList<String> inputList, String inputString) {
        boolean validation = false;
        for (int i = 0; i < inputList.size(); i++) {
            if (inputString.equalsIgnoreCase(inputList.get(i).toLowerCase())) {
                validation = true;
            }

        }
        if (validation == false) {
            teacherNames.add(inputString);
        }
        return validation;
    }
}
