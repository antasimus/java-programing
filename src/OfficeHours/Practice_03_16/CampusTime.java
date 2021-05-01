package OfficeHours.Practice_03_16;
import java.util.Scanner;
public class CampusTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();

        if (time < 0 || time > 24){
            System.out.println("Invalid time");
        }else if(time >= 8 && time <= 23){
            System.out.println("Campus is OPEN");
        }else {
            System.out.println("Campus is CLOSED");
        }
    }
}
