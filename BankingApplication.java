import java.util.*;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(); // Initialize a new bank

        while (true) {
            // Display options
            System.out.println("\nWelcome to the Simple Bank Application");
            System.out.println("1. Create an Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.next();
                    bank.createAccount(name);
                    break;
                case 2:
                    System.out.print("Enter Account ID: ");
                    int accountId = scanner.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    double amount = scanner.nextDouble();
                    bank.deposit(accountId, amount);
                    break;
                case 3:
                    System.out.print("Enter Account ID: ");
                    accountId = scanner.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    amount = scanner.nextDouble();
                    bank.withdraw(accountId, amount);
                    break;
                case 4:
                    System.out.print("Enter Account ID: ");
                    accountId = scanner.nextInt();
                    bank.checkBalance(accountId);
                    break;
                case 5:
                    System.out.println("Thank you for using the Simple Bank Application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}
