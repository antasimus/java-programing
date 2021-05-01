package day09_scanner_practice;

import java.util.Scanner;

public class RemianderOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eneter A");
        int a = scan.nextInt();
        System.out.println("Eneter B");
        int b = scan.nextInt();
        int c = a/b;
        int d = a%b;
        System.out.println("A/B="+c+"; remainder of A/B is A%B="+d);
    }
}
