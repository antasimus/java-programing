package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers for comparison");
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println(num1 + " is the largest");
        }else if(num2>=num1 && num2>=num3){
            System.out.println(num2 + " is the largest");
        }else {
            System.out.println(num3 + " is the largest");
        }
    }
}
