import java.util.ArrayList;

public class TASK21 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("List: " + numbers);
        System.out.println("First element: " + numbers.get(0));

        numbers.set(1, 25);
        numbers.remove(2);

        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("Size: " + numbers.size());
    }
}