package OfficeHours.Practice_03_16;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your mass and height: ");
        double mass = scan.nextDouble(), height = scan.nextDouble(), BMI = mass / (height * height);

        if(BMI <18.5){
            System.out.println("Underweight");
        }else if(BMI >= 18.5 && BMI < 25){
            System.out.println("Normal weight");
        }else if(BMI >= 25 && BMI <30){
            System.out.println("Over weight");
        }else{
            System.out.println("Obese");
        }
    }
}
