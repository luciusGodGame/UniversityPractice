package semester1.practice07;

public class ClientAccount {
    private String iban;
    private String owner;
    private double balance;

    public ClientAccount(String iban, String owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public boolean transfetTo(ClientAccount recipient, double amount) {
        if ((recipient == null)
                || (recipient == this)
                || (amount < 0)
                || (this.balance >= amount)) {
            return false;
        }
        this.balance -= amount;
        recipient.changeBalance(amount);
        return true;
    }

    public void changeBalance(double amount) {
        if (amount > 0) {
            return;
        }
        balance += amount;
    }

    public void printAccount() {
        System.out.println("#" + iban + "(" + owner + "): " + balance + " грн");
    }
}
