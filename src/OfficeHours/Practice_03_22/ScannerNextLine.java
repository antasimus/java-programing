package OfficeHours.Practice_03_22;
import java.util.Scanner;
public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name:");
        String name = scan.nextLine();

        System.out.println(num);
        System.out.println(name);
    }
}
