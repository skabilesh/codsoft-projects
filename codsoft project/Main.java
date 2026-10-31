
import java.util.Scanner;

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount!");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Withdrawn Amount: Rs." + amount);
        }
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount!");
        }
        else {
            balance = balance + amount;
            System.out.println("Deposit Successful!");
            System.out.println("Deposited Amount: Rs." + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(10000);

        int choice = 0;

        System.out.println("================================");
        System.out.println("          ATM INTERFACE");
        System.out.println("================================");

        do {

            System.out.println("\n1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid choice!");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter withdrawal amount: ");

                    if (sc.hasNextDouble()) {
                        double amount = sc.nextDouble();
                        account.withdraw(amount);
                    }
                    else {
                        System.out.println("Invalid amount!");
                        sc.next();
                    }

                    break;

                case 2:

                    System.out.print("Enter deposit amount: ");

                    if (sc.hasNextDouble()) {
                        double amount = sc.nextDouble();
                        account.deposit(amount);
                    }
                    else {
                        System.out.println("Invalid amount!");
                        sc.next();
                    }

                    break;

                case 3:

                    account.checkBalance();
                    break;

                case 4:

                    System.out.println("\nThank you for using ATM!");
                    System.out.println("Have a nice day!");
                    break;

                default:

                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
