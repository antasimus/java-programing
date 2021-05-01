package day19_class_vs_object_strings;
import java.util.Scanner;
public class StringCaseConversation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word(s):");
        String x= scan.nextLine();
        System.out.println("Lower case:");
        System.out.println(x.toLowerCase());
        System.out.println("Upper case:");
        System.out.println(x.toUpperCase());


        System.out.println("Enter new word:");
        String a = scan.nextLine();
        a = a.toLowerCase();
        System.out.println(a);
        a = a.toUpperCase();
        System.out.println(a);
    }
}
