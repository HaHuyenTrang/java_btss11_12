package bai9;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount; // Cho phép số dư âm
        System.out.println("Đã rút " + amount + " từ tài khoản vãng lai " + accountNumber);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Đã nạp " + amount + " vào tài khoản vãng lai " + accountNumber);
    }

    @Override
    public void displayBalance() {
        System.out.println("Tài khoản vãng lai " + accountNumber + " - Số dư: " + balance);
    }
}