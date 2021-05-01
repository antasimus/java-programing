package OfficeHours.Practice_03_03;

public class TriangleAngles {
    public static void main(String[] args) {
        int angle1 = 100;
        int angle2 = 30;
        int angle3 = 50;
        int sum = angle1 + angle2 + angle3;

        if(sum == 180){
            System.out.println("Valid triangle");
        }else{
            System.out.println("Not a triangle");
        }

        boolean check = (angle1 + angle2 + angle3) == 180;
        if(check){
            System.out.println("Triangle is valid");
        }else{
            System.out.println("Triangle is not valid");
        }
    }
}
