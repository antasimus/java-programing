package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean Fizz = num%3 == 0, Buzz = num%5 == 0, FizzBuzz = (num%3 == 0)&&(num%5 == 0);
        if(FizzBuzz){
            System.out.println(num + " is divisible with 3 & 5");
            System.out.println("FizzBuzz");
        }else if(Fizz){
            System.out.println(num + " is divisible with 3");
            System.out.println("Fizz");
        }else if(Buzz){
            System.out.println(num + " is divisible with 5");
            System.out.println("Buzz");
        }else{
            System.out.println(num+ " is not divisible with 3 or 5");
        }
    }
}
