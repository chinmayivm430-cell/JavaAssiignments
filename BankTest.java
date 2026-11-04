class BankAccount {
    private String accountNumber;
    private double balance;

    static int accountCount = 0;
    final String accountId;

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        accountCount++;

        accountId = "ACC" + accountCount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 5000);

        account.deposit(1000);
        account.withdraw(2000);

        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account ID: " + account.accountId);
    }
}
