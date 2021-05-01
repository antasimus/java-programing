package day37_methods_overloading;

public class MethodOverloading {
    public static void sum(int num1, int num2){
        System.out.println("sum(int, int)");
        System.out.println("Result=" +(num1+num2));
    }
    public static void sum(int num1, int num2, int num3){
        System.out.println("sum(int, int, int)");
        System.out.println("Result=" +(num1+num2+num3));
    }
    public static void sum(double num1, double num2){
        System.out.println("sum(double, double)");
        System.out.println("Result=" +(num1+num2));
    }
    public static void sum(String num1, String num2){
        System.out.println("sum(String, String)");
        System.out.println("Result=" +(num1+num2));
    }

    public static void main(String[] args) {
        MethodOverloading.sum(3,5);
        sum(11,13,17);
        sum(5.75,7.95);
        sum("jedi", " govna");
    }
}
