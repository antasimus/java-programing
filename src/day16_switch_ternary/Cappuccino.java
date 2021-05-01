/*
Add new class CappuccinoBuyer
main method

declare
price    ->
calories ->
size could be "tall", "grade" ,"venti"

when size = "tall"
    print "Tall Cappuccino please"
    price    ->  3.69
    calories ->  90

when size = "grade"
    print "Grande Cappuccino please"
    price    ->  3.99
    calories ->  120

when size = "venti"
    print "Venti Cappuccino please"
    price    ->  4.29
    calories ->  150

any other size:
    print "We do'nt serve that size of Cappuccino"


print "Total price: $3.69"
      "You will consume 90 cal of energy"
 */
package day16_switch_ternary;
import java.util.Scanner;
public class Cappuccino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chose size of your cappuccino (tall, grande, venti): ");
        String size = scan.next();
        double price = 0;
        int calories = 0;

        switch(size){
            case "tall":
                price = 3.69;
                calories = 90;
                System.out.println("You chose "+ size + " cappuccino \nPrice: \t\t$"+price+"\nCalories: \t"+calories);
                break;
            case "grande":
                price = 3.99;
                calories = 120;
                System.out.println("You chose "+ size + " cappuccino \nPrice: \t\t$"+price+"\nCalories: \t"+calories);
                break;

            case "venti":
                price = 4.29;
                calories = 150;
                System.out.println("You chose "+ size + " cappuccino \nPrice: \t\t$"+price+"\nCalories: \t"+calories);
                break;
            default:
                System.out.println("Wrong entry!");
        }
    }
}
