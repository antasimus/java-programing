package day19_class_vs_object_strings;
import java.util.Scanner;
public class PasswordCaracterCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new password");
        String pass = scan.next();
        if (pass.length() >= 6){
            System.out.println("Valid password");
        }else{
            System.out.println("Password to short, has to be minimum 6 characters!");
        }
    }
}
