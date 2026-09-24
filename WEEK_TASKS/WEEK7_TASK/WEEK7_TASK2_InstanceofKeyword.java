import java.util.ArrayList;
import java.util.Scanner;
class StudentPerson {}
class RockstarPerson {}
class HackerPerson {}
public class WEEK7_TASK2_InstanceofKeyword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Object> people = new ArrayList<>();
        System.out.print("Number of people: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Type (Student/Rockstar/Hacker): ");
            String type = in.next();
            if (type.equalsIgnoreCase("Student")) people.add(new StudentPerson());
            else if (type.equalsIgnoreCase("Rockstar")) people.add(new RockstarPerson());
            else if (type.equalsIgnoreCase("Hacker")) people.add(new HackerPerson());
            else System.out.println("Unknown type; skipped.");
        }
        int students = 0, rockstars = 0, hackers = 0;
        for (Object person : people) {
            if (person instanceof StudentPerson) students++;
            else if (person instanceof RockstarPerson) rockstars++;
            else if (person instanceof HackerPerson) hackers++;
        }
        System.out.println(students + " " + rockstars + " " + hackers);
    }
}