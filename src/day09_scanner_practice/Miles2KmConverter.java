package day09_scanner_practice;
import java.util.Scanner;
public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter distance in miles: ");
        double mile = scan.nextDouble();
        double km = 1.609*mile;
        System.out.println(mile +" miles is " + km + " kilometers.");
    }
}
