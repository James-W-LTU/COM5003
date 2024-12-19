
import java.util.Scanner;

class BankAccount {
    private String accountName;
    private String accountNumber;
    private double accountBalance;
    private Scanner sc;

    public BankAccount(String name, String number, double balance) {
        this.sc = new Scanner(System.in);
        this.accountName = name;
        this.accountNumber = number;
        this.accountBalance = balance;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void deposit() {
        System.out.print("Enter deposit amount: ");
        int amount = this.sc.nextInt();
        if (amount > 0) {
            this.accountBalance += (double)amount;
            System.out.println("Successfully deposited $" + amount);
            System.out.println("Updated Balance: $" + this.accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }

    }

    public void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        int amount = this.sc.nextInt();
        if (amount > 0 && (double)amount <= this.accountBalance) {
            this.accountBalance -= (double)amount;
            System.out.println("Successfully withdrew $" + amount);
            System.out.println("Updated Balance: $" + this.accountBalance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }

    }

    public void exit() {
        System.out.println("Thank you for using our service!");
    }

    public void viewInformation() {
        System.out.printf("%-20s %-10s %s %n", "Name", "Number", "Balance");
        System.out.println("-".repeat(40));
        System.out.printf("%-20s %-10s $%.2f %n", this.accountName, this.accountNumber, this.accountBalance);
    }
}
