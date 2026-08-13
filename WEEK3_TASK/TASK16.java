import java.time.LocalDate;

class TASK16 {

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 13, 2026));
    }
}