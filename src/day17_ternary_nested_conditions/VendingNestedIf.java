/*
selection = "drink" orr can be "snack"
drink = "tea" , "coke"
snack = "chips" , "candy"

when selection is "drink":
    "drink option is selected"

    when drink is "tea":
        "tea is selected"
    when drink is "coke":
        "coke is selected"
when selection is "snack"
    "snack option is selected"

    when snack is "chips":
        "chips item is selected"
    when snack is "candy":
        "candy item is selected"
 */
package day17_ternary_nested_conditions;
import java.util.Scanner;
public class VendingNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String selection = "drink", drinkItem = "tea", snackItem = "chips";
        if (selection.equals("drink")){
            System.out.println("Drink option is selected");
            if (drinkItem.equals("tea")){
                System.out.println("Tea item is selected");
        }   else{
                System.out.println("Coke item is selected");
        }
        }else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if (snackItem.equals("chips")) {
                System.out.println("chips option is selected");
            } else {
                System.out.println("candy option is selected");
            }
        }
    }
}
