package OfficeHours.Practice_03_30;
import java.util.*;
public class CreateEmal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String wordOne = scan.nextLine(), wordTwo = scan.nextLine(), email = "";

        if (wordOne.length() >= 6 && wordTwo.length() >=6){
            email = wordOne.substring(0,4);
            email += wordTwo.substring(wordTwo.length()-3);
            email += "@cybertek.com";
            System.out.println(email);

        }else{
            System.out.println("Invalid data!");

        }
    }
}
