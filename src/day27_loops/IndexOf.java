package day27_loops;
import java.util.*;
public class IndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text");
        String word = scan.nextLine();
        System.out.println("Enter character to search in the text:");
        char letter = scan.next().charAt(0);
        int index = -1;

        for(int n=0; n<word.length(); n++){
            if(word.charAt(n) == letter){
                index = n;
                System.out.println(letter + " is found at index " + index);
            }
        }
        if (index == -1){
            System.out.println(letter + " is not present");
        }
    }
}
