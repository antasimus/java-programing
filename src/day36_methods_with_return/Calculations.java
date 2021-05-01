package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("10+45="+Calculator.add(10,45));
        System.out.println("100-40="+Calculator.minus(100,40));
        System.out.println("75/11="+Calculator.divide(75,11));
        System.out.println("17*13="+Calculator.multiply(17,13));
        
        double d1=234.5, d2=321.3;
        double result = Calculator.minus(d1,d2);
        System.out.println("result = " + result);
    }
}
