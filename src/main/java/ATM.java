
import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;

        do {
            System.out.println("\n===== ATM INTERFACE =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Available Balance: Rs. %.2f%n",
                            account.checkBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    if (scanner.hasNextDouble()) {
                        account.deposit(scanner.nextDouble());
                    } else {
                        System.out.println("Invalid amount!");
                        scanner.next();
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    if (scanner.hasNextDouble()) {
                        account.withdraw(scanner.nextDouble());
                    } else {
                        System.out.println("Invalid amount!");
                        scanner.next();
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Select 1 to 4.");
            }
        } while (choice != 4);
    }
}
