public class WEEK2_TASK3_HighestAltitude {
    static int findHighestAltitude(int[] gains) {
        int currentAltitude = 0;
        int highestAltitude = 0;

        for (int gain : gains) {
            currentAltitude += gain;
            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude;
            }
        }
        return highestAltitude;
    }

    public static void main(String[] args) {
        int[] gains = {-5, 1, 5, 0, -7};
        System.out.println(findHighestAltitude(gains));
    }
}
