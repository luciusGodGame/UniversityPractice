package semester1.practice07;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        balance = initialBalance;
        if (balance < 0) {
            balance = 0.0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance || amount == 0) {
            System.out.println("Операцію відхилено");
            return false;
        }
        balance -= amount;
        return true;
    }

    public void printAccount() {
        System.out.println("Акаунт #" + accountNumber +
                "\nВласник:" + ownerName +
                "\nБаланс:" + balance);
    }
}
