package day35_methods_with_paramet;
import java.util.*;
public class Counters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        count(5);
        count(7);
        count(2);
        System.out.println("Enter counter value: ");
        int X= scan.nextInt();
        count(X);

        System.out.println("Enter your birth year:");
        int bY= scan.nextInt();
        printAge(bY);
    }

    public static void count(int num){
        for (int i = 0; i <= num ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("Birth year: " + year + ". Age: " + age);
    }

}
