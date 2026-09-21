import java.time.LocalDate;

public class WEEK3_TASK4_DAY_OF_THE_WEEK {

    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);

        String dayName = date.getDayOfWeek().toString();

        return dayName.substring(0, 1) +
               dayName.substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        int day = 31;
        int month = 8;
        int year = 2019;

        System.out.println(dayOfTheWeek(day, month, year));
    }
}
