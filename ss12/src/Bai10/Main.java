package Bai10;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000);
        DebitCard debitCard = new DebitCard(1000);
        Cash cash = new Cash(1000);


        System.out.printf("Total payment (Creadit Card):"+ creditCard.processPayment());

        creditCard.processPayment(creditCard.getAmount(), "USD");
        creditCard.processPayment(creditCard.processPayment(), "USD");


        System.out.printf("Total payment (Debit Card): "+ debitCard.processPayment());
        debitCard.processPayment(debitCard.getAmount(), "EUR");
        debitCard.processPayment(debitCard.processPayment(), "EUR");


        System.out.printf("Total payment (Cash): "+ cash.processPayment());
        cash.processPayment(cash.getAmount(), "JPY");
        cash.processPayment(cash.processPayment(), "JPY");
    }
}
