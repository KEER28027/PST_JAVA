import java.util.HashSet;

class Task15 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate: will not be added

        System.out.println(numbers); // [20, 10] (order may vary)

        System.out.println(numbers.contains(20)); // true

        numbers.remove(10);

        System.out.println(numbers); // [20]
        System.out.println(numbers.size()); // 1
    }
}