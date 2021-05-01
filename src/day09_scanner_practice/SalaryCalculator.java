package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your hourly rate: ");
        double rate = scan.nextDouble();
        System.out.println();
        double weekly = 40*rate;
        double annual = 52*weekly;
        double monthly = annual/12;
        System.out.println("My weekly salary is: $"+weekly);
        System.out.println("My monthly salary is: $"+monthly);
        System.out.println("My annually rate is: $"+annual);

    }
}
