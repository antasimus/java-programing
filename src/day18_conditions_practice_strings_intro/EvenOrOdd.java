package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        if (num%2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
