import java.util.Scanner;
public class WEEK7_TASK9_JavaGenerics {
    static <T> void printArray(T[] values) {
        for (T value : values) System.out.println(value);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of integers: ");
        Integer[] numbers = new Integer[in.nextInt()];
        System.out.println("Enter the integers:");
        for (int i = 0; i < numbers.length; i++) numbers[i] = in.nextInt();
        System.out.print("Number of words: ");
        String[] words = new String[in.nextInt()];
        System.out.println("Enter the words:");
        for (int i = 0; i < words.length; i++) words[i] = in.next();
        System.out.println("Integer array:");
        printArray(numbers);
        System.out.println("String array:");
        printArray(words);
    }
}