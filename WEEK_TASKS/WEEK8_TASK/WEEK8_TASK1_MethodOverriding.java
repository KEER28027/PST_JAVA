public class WEEK8_TASK1_MethodOverriding {
    static class Sports {
        String getName() { return "Generic Sports"; }
        void getNumberOfTeamMembers() {
            System.out.println("Each team has n players in " + getName());
        }
    }

    static class Soccer extends Sports {
        @Override String getName() { return "Soccer Class"; }
        @Override void getNumberOfTeamMembers() {
            System.out.println("Each team has 11 players in " + getName());
        }
    }

    public static void main(String[] args) {
        Sports sports = new Sports();
        Soccer soccer = new Soccer();
        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
