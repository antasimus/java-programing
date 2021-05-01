package day19_class_vs_object_strings;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text:");
        String word = scan.nextLine();
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("Entered tex has" + word.length() + "characters");
        
        int count = word.length();
        System.out.println("count = " + count);
    }
}
