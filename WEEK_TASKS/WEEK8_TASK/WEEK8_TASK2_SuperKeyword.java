public class WEEK8_TASK2_SuperKeyword {
    static class Bicycle {
        String define() { return "a cycle with pedals."; }
    }

    static class Motorcycle extends Bicycle {
        @Override String define() { return "a cycle with an engine."; }
        void printDescription() {
            System.out.println("Hello I am a motorcycle, I am " + super.define());
            System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
        }
    }

    public static void main(String[] args) {
        new Motorcycle().printDescription();
    }
}
