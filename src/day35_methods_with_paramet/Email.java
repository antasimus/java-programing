package day35_methods_with_paramet;
import java.util.*;
public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email name:");
        String emailName= scan.next();
        System.out.println("Enter email domain:");
        String emailDomain= scan.next();
        buildEmail(emailName,emailDomain);
    }
    public static void buildEmail(String name, String domain){
        String email=name+"@"+domain+".com";
        System.out.println(email);
    }
}
