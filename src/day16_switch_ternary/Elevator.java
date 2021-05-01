package day16_switch_ternary;
import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chose the level: ");
        int floor = scan.nextInt();
/*
        if (floor == 1){
            System.out.println("On level: " + floor + " - Lobby, Verizon, Sturbacks");
        }else if(floor == 2){
            System.out.println("On level: " + floor + " - Cybertek, NASA, Intelsat ");
        }else if(floor == 3){
            System.out.println("On level: " + floor + " - Lyft, BoFa, Stake House");
        }else{
            System.out.println("Invalid entry");
        }
*/
        switch(floor){
            case 1:
                System.out.println("On level: " + floor + " - Lobby, Verizon, Sturbacks");
                break;
            case 2:
                System.out.println("On level: " + floor + " - Cybertek, NASA, Intelsat ");
                break;
            case 3:
                System.out.println("On level: " + floor + " - Lyft, BoFa, Stake House");
            default:
                System.out.println("Invalid entry");
        }

    }
}
