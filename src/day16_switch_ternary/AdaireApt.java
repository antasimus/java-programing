package day16_switch_ternary;
import java.util.Scanner;
public class AdaireApt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bedrooms = scan.nextInt();
        double startingPrice = 0;
        switch(bedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println(bedrooms + " bedroom currently unavailable");
                //return; exit MAIN method
        }

        System.out.println("Starting price: $" + startingPrice);
    }
}
