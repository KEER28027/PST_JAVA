import java.util.Scanner;

class TASK8 {

    static boolean match(String word, String pattern) {

        for (int i = 0; i < word.length(); i++) {

            for (int j = i + 1; j < word.length(); j++) {

                if (pattern.charAt(i) == pattern.charAt(j) &&
                    word.charAt(i) != word.charAt(j)) {
                    return false;
                }

                if (pattern.charAt(i) != pattern.charAt(j) &&
                    word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        String pattern = sc.next();

        for (int i = 0; i < n; i++) {
            if (match(words[i], pattern)) {
                System.out.print(words[i] + " ");
            }
        }
    }
}