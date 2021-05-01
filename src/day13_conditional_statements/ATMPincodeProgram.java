package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("****** WELCOME TO TD BANK ATM ******");
        int secretPin = 2233;
        int inputPin = 2233;
        if (secretPin == inputPin) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit");
        } else{
            System.out.println("Incorrect PIN code! " + inputPin );
            System.out.println("Please try again");
        }
    }
}
