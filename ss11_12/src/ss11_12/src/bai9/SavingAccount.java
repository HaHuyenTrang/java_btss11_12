package bai9;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ.");
        } else {
            balance -= amount;
            System.out.println("Đã rút " + amount + " từ tài khoản tiết kiệm " + accountNumber);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Đã nạp " + amount + " vào tài khoản tiết kiệm " + accountNumber);
    }

    @Override
    public void displayBalance() {
        System.out.println("Tài khoản tiết kiệm " + accountNumber + " - Số dư: " + balance);
    }
}