import java.util.*;

public class Bank {
    private HashMap<Integer, BankAccount> accounts;
    private int accountCounter;

    public Bank() {
        accounts = new HashMap<>();
        accountCounter = 1;
    }

    public void createAccount(String name) {
        BankAccount newAccount = new BankAccount(accountCounter, name);
        accounts.put(accountCounter, newAccount);
        System.out.println("Account created successfully. Account ID: " + accountCounter);
        accountCounter++;
    }

    public void deposit(int accountId, double amount) {
        BankAccount account = accounts.get(accountId);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountId, double amount) {
        BankAccount account = accounts.get(accountId);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(int accountId) {
        BankAccount account = accounts.get(accountId);
        if (account != null) {
            account.displayBalance();
        } else {
            System.out.println("Account not found.");
        }
    }
}
