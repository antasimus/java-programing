package day29_nested_loop_arrays;
import java.util.Scanner;
public class CountCharsNestedLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scan.nextLine();
        for (int outer = 0; outer < text.length(); outer++) {
            System.out.println("outer: " + text.charAt(outer));
            int count = 1;
            for (int inner = 0; inner < text.length(); inner++) {
                //System.out.println(inner);
                if (text.charAt(outer)==text.charAt(inner) && outer != inner){
                    count++;
                }
            }
            System.out.println(text.charAt(outer) + " : " + count);

        }
    }
}
