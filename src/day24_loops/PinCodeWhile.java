package day24_loops;
import java.util.Scanner;
public class PinCodeWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPin=1234, pin;
        do{
            System.out.println("Enter PIN: ");
            pin= scan.nextInt();
        }while(secretPin!=pin);
        System.out.println("Welcome to your account");
    }
}
