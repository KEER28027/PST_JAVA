import java.util.*;

public class WEEK11_TASK6_PASCALS_TRIANGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        for (ArrayList<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
