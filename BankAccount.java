package ATM;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    
    public boolean deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

public boolean withdraw (double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        return true;
    }
    return false;
}

public double checkbalance() {
    return balance;
    }

}
