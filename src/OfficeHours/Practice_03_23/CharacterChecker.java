package OfficeHours.Practice_03_23;
import java.util.Scanner;
public class CharacterChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num > 0) {
            // pos
            System.out.println("Enter a single word");
            String word = input.next();

            if (word.length() % 2 == 0) {
                System.out.println(word + " is even length");
            } else {
                System.out.println(word + " is odd length");
            }

        } else {
            // neg

            System.out.println("Enter a character");
            char letter = input.next().charAt(0);

            /*
        [Character Checker]
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' --> lowercase
        'G' --> uppercase 'O' --> uppercase
        Hint: Use the ASCII table
             */

            if (letter >= 'A' && letter <= 'Z') { // if(letter >= 65 && letter <= 90) {
                System.out.println(letter + " is a uppercase letter");
            } else if (letter >= 'a' && letter <= 'z') { //} else if(letter >= 97 && letter <= 122){
                System.out.println(letter + " is a lowercase letter");
            } else {
                System.out.println(letter + " is not a valid letter");
            }

        }
    }
}
