package day14_multi_branch_if_statement;
import java.util.Scanner;
public class CalculatorV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        int a= scan.nextInt();
        System.out.println("Enter b:");
        int b= scan.nextInt();
        System.out.println("Input mathematical operation:");
        String operator= scan.next();
        if(operator.equals("+")){
            System.out.println(a+operator+b+"="+(a+b));
        }else if(operator.equals("-")){
            System.out.println(a+operator+b+"="+(a-b));
        }else if(operator.equals("*")){
            System.out.println(a+operator+b+"="+(a*b));
        }else if(operator.equals("/")){
            System.out.println(a+operator+b+"="+(a/b));
        }else
            System.out.println("Wrong entry!");


        // proba sa char

        System.out.println("Enter c:");
        double c= scan.nextDouble();
        System.out.println("Enter d:");
        double d= scan.nextDouble();
        System.out.println("Input mathematical operation:");
        char Op= scan.next().charAt(0);
        if(Op == '+'){
            System.out.println(c+""+""+Op+""+d+"="+(c+d));
        }else if(Op == '-'){
            System.out.println(c+""+""+Op+""+d+"="+(c-d));
        }else if(Op == '*'){
            System.out.println(c+""+""+Op+""+d+"="+(c*d));
        }else if(Op == '/'){
            System.out.println(c+""+""+Op+""+d+"="+(c/d));
        }else
            System.out.println("Wrong entry!");
    }
}
