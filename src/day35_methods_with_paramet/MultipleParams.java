package day35_methods_with_paramet;
import java.util.*;
public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        double a=scan.nextDouble(), b=scan.nextDouble();

        showSum(a,b);
    }
    public static void showSum(double num1, double num2){
        double sum = num1 + num2;
        System.out.println(num1+"+"+num2+"="+sum);
    }
}
