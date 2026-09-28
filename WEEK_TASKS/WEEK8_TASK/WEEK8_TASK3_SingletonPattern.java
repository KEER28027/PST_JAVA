import java.util.Scanner;

public class WEEK8_TASK3_SingletonPattern {
    static class Singleton {
        public String str;
        private static final Singleton INSTANCE = new Singleton();
        private Singleton() {}
        public static Singleton getSingleInstance() { return INSTANCE; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Singleton instance = Singleton.getSingleInstance();
        instance.str = scanner.hasNextLine() ? scanner.nextLine() : "";
        System.out.println("Hello I am a singleton! Let me say " + instance.str + " to you");
        scanner.close();
    }
}
