import java.util.Scanner;

public class SYLLABUS_TASK5_BankingTransactionSystem {
    static class BankAccount {
        private int balance;

        void deposit(int amount) {
            balance = balance + amount;
        }

        void withdraw(int amount) {
            if (amount <= balance) {
                balance = balance - amount;
            }
        }

        int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BankAccount account = new BankAccount();

        for (int i = 0; i < n; i++) {
            String operation = input.next();
            int amount = input.nextInt();
            if (operation.equalsIgnoreCase("Deposit")) {
                account.deposit(amount);
            } else if (operation.equalsIgnoreCase("Withdraw")) {
                account.withdraw(amount);
            }
        }
        System.out.println(account.getBalance());
    }
}
