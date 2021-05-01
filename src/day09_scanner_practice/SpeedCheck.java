package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current speed: ");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int overTheLimit =  currentSpeed-speedLimit;
        if (currentSpeed > speedLimit) {
            System.out.println("You are driving " +overTheLimit + " over the limit, please slow down!"); }
        else { System.out.println("You are driving in the speed limit range."); }

    }
}
