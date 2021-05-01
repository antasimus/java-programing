/*
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */
package OfficeHours.reptil;
import java.util.*;
public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String guestList = input.next(), question;
        do{
            System.out.println("Do you want to enter new guest name:");
            question = input.next();
            if (question.equalsIgnoreCase("yes")){
                System.out.println("Please enter guest name:");
                guestList += ", " + input.next();
            }

        }while (question.equalsIgnoreCase("yes"));
        System.out.println("Guest's list: " + guestList);
    }
}
