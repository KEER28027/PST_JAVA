import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
class FamilyTree {
    private Map<String, List<String>> children = new HashMap<>();
    private List<String> dead = new ArrayList<>();
    FamilyTree(String king) { children.put(king, new ArrayList<>()); }
    void birth(String parent, String child) {
        children.computeIfAbsent(parent, k -> new ArrayList<>()).add(child);
        children.put(child, new ArrayList<>());
    }
    void death(String name) { dead.add(name); }
    List<String> inheritanceOrder(String king) {
        List<String> result = new ArrayList<>();
        visit(king, result);
        return result;
    }
    private void visit(String name, List<String> result) {
        if (!dead.contains(name)) result.add(name);
        for (String child : children.get(name)) visit(child, result);
    }
}
public class WEEK7_TASK10_ThroneInheritance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("King's name: ");
        String king = in.next();
        FamilyTree family = new FamilyTree(king);
        System.out.print("Number of events: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Event (birth/death/order): ");
            String action = in.next();
            if (action.equals("birth")) {
                System.out.print("Parent and child names: ");
                family.birth(in.next(), in.next());
            } else if (action.equals("death")) {
                System.out.print("Name: ");
                family.death(in.next());
            } else if (action.equals("order")) {
                System.out.println(family.inheritanceOrder(king));
            } else System.out.println("Unknown event.");
        }
    }
}