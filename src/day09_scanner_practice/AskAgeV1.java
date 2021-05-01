package day09_scanner_practice;

import java.util.Scanner;

public class AskAgeV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        //int age;
        //age = scan.nextInt();
        int age = scan.nextInt();
        byte B= scan.nextByte();
        //char C = scan.nextChar();  nece da prihvati nextChar
        short S = scan.nextShort();
        System.out.println(age + " is a great age.");
        System.out.println(B);
        System.out.println(S);
    }
}

