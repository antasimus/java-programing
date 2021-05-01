package day26_loops;
import java.util.Scanner;
public class CountMatches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text: ");
        String word = scan.nextLine();
        System.out.println("Enter a letter to count how many times appears n the text: ");
        char letter = scan.next().charAt(0);
        int count = 0;

        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) == letter ){
                count +=1;
            }
        }
        System.out.println("letter " + letter + " is happening " + count + " in this text." );
    }
}
