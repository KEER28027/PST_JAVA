import java.time.LocalDate;

public class WEEK3_TASK3_DAY_OF_YEAR {

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
