package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class Authentications {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int expSSN = 2468, expPIN = 4787;
        System.out.println("Enter last 4 of your SSN and your PIN");
        int last4SSN = scan.nextInt(), PIN = scan.nextInt();
        if(last4SSN == expSSN && PIN == expPIN){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication NOT successful");
            if(last4SSN != expSSN){
                System.out.println("Last 4 of your SSN is incorrect");
            }
            if(PIN != expPIN){
                System.out.println("PIN is incorrect");
            }
        }


    }
}
