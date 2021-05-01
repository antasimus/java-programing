package OfficeHours.Practice_03_22;

public class OperatorsExample {
    public static void main(String[] args) {
        int a=3, b=2;
        long c = (a-- + b) * 2 / 3 % 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        short d = (short)((a-- + b) * 2 / 3 % 2);
        System.out.println("d = " + d);
    }
}
