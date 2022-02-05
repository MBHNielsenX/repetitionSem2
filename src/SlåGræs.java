public class SlåGræs {
    public static void main(String[] args) {
        System.out.println(whenToCutGrassNext(0.2, 3));

        System.out.println(0.8 / 24);

    }

    public static double whenToCutGrassNext (double currentGrassLength, double maxHeight) {
        double counter = 0.0;
        double timeToCut = 0.0;
        double growthOfGrass = 0.8;
        double days = 0.0;
        double hous = 0.0;

        do {
            if (currentGrassLength < maxHeight) {
                currentGrassLength += growthOfGrass;
                counter += 0.8;
            }

        } while (currentGrassLength < maxHeight);

        return days;
    }
}
