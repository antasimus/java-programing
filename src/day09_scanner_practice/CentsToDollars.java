package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount in Cents:");
        int cents = scan.nextInt();
        int dollars = cents/100;
        int remainingCents = cents % 100;
        System.out.println("In "+cents+" cents is: "+dollars+" dollars and "+remainingCents+"cents" );
    }
}
