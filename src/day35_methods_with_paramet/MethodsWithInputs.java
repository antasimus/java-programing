package day35_methods_with_paramet;
import java.util.*;
public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(94);
        greetByName("Misha");
    }
    public static void displayValue(int num){
        System.out.println("value is " + num);
    }

    public static void greetByName(String name){
        System.out.println("Hello " +name+ ", how are you today?");
    }
}
