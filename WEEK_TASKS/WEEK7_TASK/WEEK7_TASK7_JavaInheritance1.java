import java.util.Scanner;

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}

public class WEEK7_TASK7_JavaInheritance1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bird bird = new Bird();

        System.out.println("Choose an action: walk, fly, or sing.");
        System.out.print("How many actions do you want to perform? ");
        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter action: ");
            String action = input.next();

            if (action.equalsIgnoreCase("walk")) {
                bird.walk();
            } else if (action.equalsIgnoreCase("fly")) {
                bird.fly();
            } else if (action.equalsIgnoreCase("sing")) {
                bird.sing();
            } else {
                System.out.println("Unknown action.");
            }
        }
    }
}
