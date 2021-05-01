package day20_string_manipulation;
import java.lang.*; /** import all classes from java.lang package and this is automatically added */
import java.util.*;
public class StringCreationMethods {
    public static void main(String[] args) {
        String word1 = "imac";
        String word2 = new String("macbook");
        String word3 = "";
        String word4 = new String();
        System.out.println(word2);

        Scanner scan = new Scanner(System.in);

        String car = "Lexus";
        System.out.println(car.isEmpty());

        String city = "";
        System.out.println(city.isEmpty());
        System.out.println(city.length() == 0);
    }
}
