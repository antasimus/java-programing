package OfficeHours.Practice_05_12;

public class Bank {
    public static void main(String[] args) {

        BankAccount bankAccountOne = new BankAccount();
        bankAccountOne.accountHolderName = "James Bond";
        bankAccountOne.pin = 1234;
        bankAccountOne.balance = 1_000_000;
        bankAccountOne.accountNumber = 21324354;

        System.out.println(bankAccountOne.pin);
        System.out.println(bankAccountOne.getBalance(1234));
        System.out.println();
        System.out.println(new BankAccount().accountHolderName);

        bankAccountOne = new BankAccount();
        System.out.println(bankAccountOne.accountHolderName);

    }
}
