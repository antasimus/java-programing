/*
add new java class UsedCarSelector
add main method

Car dealership:

budget = 5000
model -> "Toyota" , "Honda" ,"Tesla"
carPrice = 4500
using If condition with logical operators, decide if you would like
to purchase the car.

1 - needs to be within budget
    AND
2 - needs to be "Toyota" OR "Honda" OR "Tesla"
 */
package day15_logicalops_switch_ternary;
import java.util.Scanner;
public class UsedCarSelector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chose your budget and car model. \nPlease chose between Honda, Toyota and Tesla.");
        double budget = scan.nextDouble(), price=0;
        String model = scan.next();
        boolean B=true;

        if(model.equals("Honda")) {
            price = 8500.00;
        }else if(model.equals("Toyota")){
            price = 9200.00;
        }else if(model.equals("Tesla")){
            price = 25000.00;
        }else{
            System.out.println("Wrong selection");
            B=false;
        }
        if(B){
              if (price <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))){
                  System.out.println("Ready to purchase model "+model+" for $"+price);
              }else{
                  System.out.println("Not interested in " + model);
              }
        }else{
            System.out.println("Start your search again");
        }
    }
}
