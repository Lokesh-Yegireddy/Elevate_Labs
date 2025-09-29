import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<String> transactions;

    public Account() {
        balance = 0.0;
        transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive!");
            return;
        }
        balance += amount;
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        transactions.add("Deposit: " + amount + " | Balance: " + balance + " | Time: " + time);
        System.out.println("Deposited " + amount + ". Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds! Current Balance: " + balance);
            return;
        }
        balance -= amount;
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        transactions.add("Withdraw: " + amount + " | Balance: " + balance + " | Time: " + time);
        System.out.println("Withdrew " + amount + ". Current Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void showTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        System.out.println("----- Transaction History -----");
        for (String t : transactions) {
            System.out.println(t);
        }
        System.out.println("-------------------------------");
    }
}
