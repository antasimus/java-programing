package day19_class_vs_object_strings;
import java.util.Scanner;
public class LoginTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String expUser = "cybertek", expPass = "Abc123";
        System.out.println("Enter your user name:");
        String user = scan.next();
        System.out.println("Enter your password:");
        String pass = scan.next();

        if (user.equalsIgnoreCase(expUser) && pass.equals(expPass)){
            System.out.println("Pass - user successfully lodged in");
        }else{
            if (!user.equalsIgnoreCase(expUser)){
                System.out.println("Username invalid");
            }
            if (!pass.equals(expPass)){
                System.out.println("Password invalid");
            }
        }

    }
}
