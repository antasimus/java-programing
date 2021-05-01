package OfficeHours.Homework;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Unesi broj");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Unesi rec");
        String b = scan.nextLine();
        System.out.println("Unesi broj");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Unesi drugu rec");
        String e = scan.nextLine();
        System.out.println("Unesi karakter");
        char c = scan.next().charAt(0);


        System.out.println(a + b + c + d + e);

    }
}
