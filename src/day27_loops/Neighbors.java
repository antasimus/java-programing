package day27_loops;
import java.util.*;
public class Neighbors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text: ");
        String word = scan.nextLine();

        for (int i=0; i<word.length()-1; i++){
            System.out.println(word.charAt(i));
            System.out.println(word.charAt(i+1));

            if(word.charAt(i) == word.charAt(i+1)){
                System.out.println("beep - " + word.charAt(i));
            }else{

            }
        }
    }
}
