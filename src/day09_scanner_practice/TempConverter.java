package day09_scanner_practice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter temperature in F:");
        double tempF = scan.nextDouble();
        double tempC = (tempF-32)*5/9;
        System.out.println(tempF+"F is "+tempC+"C");
    }
}
