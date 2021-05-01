package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class IfWithoutCurlyBraces2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if(score ==1)
            System.out.println("score is 1");
        System.out.println("1 is score");
    }
}
