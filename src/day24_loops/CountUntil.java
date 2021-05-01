package day24_loops;
import java.util.*;
public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until: ");
        int numberToStop = scan.nextInt();
        int start = 1;

        while (start <= numberToStop){
            System.out.print(start+" ");
            start++;
        }
    }
}
