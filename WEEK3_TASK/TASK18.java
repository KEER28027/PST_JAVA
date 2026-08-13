import java.time.LocalDate;

class TASK18 {

    public static int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);
        return d.getDayOfYear();
    }

    public static void main(String[] args) {

        String date = "2019-01-09";

        int result = dayOfYear(date);

        System.out.println("Day of the year: " + result);
    }
}