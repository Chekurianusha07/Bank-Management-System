import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, String accountHolderName) {
        if (!accounts.containsKey(accountNumber)) {
            Account newAccount = new Account(accountNumber, accountHolderName);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Account with this number already exists.");
        }
    }

    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}
