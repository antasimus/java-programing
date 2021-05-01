package OfficeHours.Practice_03_03;

public class NumberDivisibleBy2_3_5 {
    public static void main(String[] args) {
        int numb = 65;
        boolean by2 = numb % 2 == 0;
        boolean by3 = numb % 3 == 0;
        boolean by5 = numb % 5 == 0;

        System.out.println("by2 = " + by2);
        System.out.println("by3 = " + by3);
        System.out.println("by5 = " + by5);
    }
}
