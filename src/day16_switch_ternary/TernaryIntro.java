package day16_switch_ternary;
import java.util.Scanner;
public class TernaryIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println("You " + result + " the test.");
    }
}
