package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(4329187564382L);
        acc.setBalance(250.50);
        acc.setAccountHolder("Misha Antic");
        System.out.println("acc = " + acc);
    }
}
