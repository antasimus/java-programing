package day09_scanner_practice;
import java.util.Scanner;
public class GroceriesShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter milk price: ");
        double price1 = scan.nextDouble();
        System.out.println("Enter bread price: ");
        double price2 = scan.nextDouble();
        System.out.println("Enter cucumber price: ");
        double price3 = scan.nextDouble();
        double totalPrice = price1+price2+price2;
        System.out.println("Total cost is $" + totalPrice);
    }
}
