package OfficeHours;

public class OperatorAnalyze {
    public static void main(String[] args) {
        int a = 5; // a = 5
        int b = a++ + a-- + a * 2 + a + ++a;
        //      5   + 6   + 5 * 2 + 5 + 6
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();
        
        int c = 200;
        int d = -c++ + - --c * c-- % 2 + c;
        //      -200 + - 200 * 200 % 2 + 199
        //      -200 + -40000 % 2 +199
        //      -200 + 0 + 199
        //      -200 + 199
        //  d = -1
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
