package day25_loops;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end value: ");
        int start = scan.nextInt(), end = scan.nextInt();
        if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.println("i = " + i);
            }
        }else if(start > end){
            for (int i = start; i >= end; i--) {
                System.out.println("i = " + i);
            }
        }else{
            System.out.println("Numbers are equal.");
        }

    }
}
