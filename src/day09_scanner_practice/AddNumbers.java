package day09_scanner_practice;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert A: ");
        int A = scan.nextInt();
        System.out.println("Insert B: ");
        int B = scan.nextInt();
        int C = A + B;
        System.out.println("A+B=" +C);

    }
}
