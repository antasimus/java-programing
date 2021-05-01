package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String todaysClass = scan.next();

        if (todaysClass.equals("java"))
            System.out.println("Java is fun");
        else
            System.out.println("It is not Java, it is "+ todaysClass);

    }
}
