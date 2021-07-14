package day61_exceptions_collections;

import java.util.ArrayList;
import java.util.List;

public class ErrorExamples {
    public static void main(String[] args) {
        //StackOverError
        try {
            myMethod();
        } catch (StackOverflowError error) {
            System.out.println("StackOverflowError happened");
        }
        System.out.println("--AFTER ERROR");

        List<Integer> nums = new ArrayList<>();
        while(true){
            nums.add(100);
        }
    }
    static int counter = 0;

    public static void myMethod(){
        System.out.println(counter++);
        myMethod();
    }
}
