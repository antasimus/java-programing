package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT
        int num1=10;
        int num2=++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //POST-INCREMENT
        int num3=15;
        int num4=num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        //POST-DECREMENT
        int num5=27;
        int num6=num5--;
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

        //PRE-DECREMENT
        int num7=33;
        int num8=--num7;
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);

        int myNumb=17;
        System.out.println(myNumb);
        System.out.println(++myNumb);
        System.out.println(myNumb);
        System.out.println(myNumb++);
        System.out.println(myNumb);

        int a=50, b=22, c = a++ + ++b;
        System.out.println("a = " + a +"; b = "+b+"; c = "+c);
    }
}
