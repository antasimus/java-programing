package day19_class_vs_object_strings;
import java.util.Scanner;
public class CheckCaseMatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text:");
        String word = scan.nextLine();
        if (word.equals(word.toUpperCase())){
            System.out.println("All characters in text: " + word + " are upper case.");
        }else{
            System.out.println("Not all characters in tex: " + word + " are upper case!");
        }
        System.out.println("word = " + word);
    }
}
