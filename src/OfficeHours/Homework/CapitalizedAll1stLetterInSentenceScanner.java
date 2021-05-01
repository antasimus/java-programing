package OfficeHours.Homework;
import java.util.Scanner;
public class CapitalizedAll1stLetterInSentenceScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text with random upper and lover case:");
        String text = scan.nextLine(), capitalizedWords="";
        int emptySpace = text.indexOf(" ");
        while (emptySpace != -1 ) {
            capitalizedWords = capitalizedWords + (text.substring(0,1).toUpperCase() + text.substring(1, emptySpace).toLowerCase() + " ");
            text = text.substring(emptySpace+1);
            emptySpace = text.indexOf(" ");
        }
        capitalizedWords = capitalizedWords + (text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase() + " ");
        System.out.println(capitalizedWords);
    }
}
