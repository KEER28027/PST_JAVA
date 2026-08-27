import java.util.*;

public class TASK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        int[] left = new int[26];
        int[] right = new int[26];

        for (int i = 0; i < n / 2; i++)
            left[s.charAt(i) - 'a']++;

        for (int i = (n + 1) / 2; i < n; i++)
            right[s.charAt(i) - 'a']++;

        System.out.println(Arrays.equals(left, right) ? "YES" : "NO");
    }
}