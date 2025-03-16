package bai9;

public class Test {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("MB25", 51000);
        CheckingAccount checkingAccount = new CheckingAccount("HD24", 2000);

        savingAccount.deposit(100);
        savingAccount.withdraw(200);

        checkingAccount.deposit(200);
        checkingAccount.withdraw(100);

        savingAccount.withdraw(200000);
    }
}
