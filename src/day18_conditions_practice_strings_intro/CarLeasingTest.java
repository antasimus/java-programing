package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class CarLeasingTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chose car make and model:");
        String make = scan.next(), model = scan.next();
        double price = 0;

        if (make.equals("Mercedes")){
            if(model.equals("E")) {
                price = 500;
            } else if(model.equals("A")){
                price = 350;
            } else{
                System.out.println("Invalid model");
            }
        } else if(make.equals("Audi")) {
            if (model.equals("Q5")) {
                price = 490;
            } else if (model.equals("A4")) {
                price = 420;
            } else{
                System.out.println("Invalid model");
            }
        } else{
            System.out.println("Invalid make");
        }
        System.out.println("Make: \t\t" + make);
        System.out.println("Model: \t\t" + model);
        System.out.println("Price: \t\t" + price);
    }
}
