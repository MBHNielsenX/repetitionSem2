public class Kvadrat {
    public static void main(String[] args) {
        kvadrat(6, "o");

    }
    public static void kvadrat(int number, String sign) {
        String xAxis = "";
        for (int i = 0; i < number; i++) {
            xAxis += " " + sign + " ";
        }

        for (int i = 0; i < number; i++) {
            System.out.println(xAxis);
        }
    }
}
