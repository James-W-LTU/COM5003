
import java.util.Scanner;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "123456789", (double)1000.0F);
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nWelcome, " + account.getAccountName() + "\n\t1. View account information \n\t2. Deposit \n\t3. Withdraw \n\t4. Exit \nEnter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    account.viewInformation();
                    break;
                case 2:
                    account.deposit();
                    break;
                case 3:
                    account.withdraw();
                    break;
                case 4:
                    account.exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 4);

    }
}
