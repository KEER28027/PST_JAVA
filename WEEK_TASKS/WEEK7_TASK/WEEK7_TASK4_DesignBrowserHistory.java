import java.util.ArrayList;
import java.util.Scanner;
class PageHistory {
    private ArrayList<String> pages = new ArrayList<>();
    private int current = 0;
    PageHistory(String home) { pages.add(home); }
    void visit(String url) {
        while (pages.size() > current + 1) pages.remove(pages.size() - 1);
        pages.add(url);
        current++;
    }
    String back(int steps) {
        current = Math.max(0, current - steps);
        return pages.get(current);
    }
    String forward(int steps) {
        current = Math.min(pages.size() - 1, current + steps);
        return pages.get(current);
    }
    String currentPage() { return pages.get(current); }
}
public class WEEK7_TASK4_DesignBrowserHistory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Homepage: ");
        PageHistory browser = new PageHistory(in.next());
        System.out.print("Number of actions: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Action (visit/back/forward) and value: ");
            String action = in.next();
            if (action.equals("visit")) browser.visit(in.next());
            else if (action.equals("back")) System.out.println(browser.back(in.nextInt()));
            else if (action.equals("forward")) System.out.println(browser.forward(in.nextInt()));
            else System.out.println("Unknown action. Current page: " + browser.currentPage());
        }
    }
}