import java.util.*;

public class WEEK10_TASK10_PHONE_CONTACT_DIRECTORY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> contacts = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            contacts.put(sc.next(), sc.next());
        }

        String searchName = sc.next();
        System.out.println(contacts.getOrDefault(searchName, "Contact not found"));

        String updateName = sc.next();
        String newNumber = sc.next();
        contacts.put(updateName, newNumber);
        System.out.println(contacts.get(updateName));
    }
}
