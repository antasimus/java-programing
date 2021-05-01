package day26_loops;
import java.util.Scanner;
public class PrintChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scan.nextLine();

        for (int i=0; i < word.length(); i++ ){
            System.out.println(word.charAt(i));
        }
        System.out.println("Entered word backwards: ");
        for (int i=(word.length()-1); i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
