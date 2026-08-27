import java.util.*;

public class TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();
        int count1 = 0, count2 = 0;

        for (int i = 0; i < n / 2; i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1)
                count1++;
        }

        for (int i = n / 2; i < n; i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1)
                count2++;
        }

        System.out.println(count1 == count2);
    }
}