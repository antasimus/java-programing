package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 3;
        boolean isPrimeMember = false;

        if (isPrimeMember){
            System.out.println("Eligible for free 2 days shipping");
        }else{
            if (itemPrice >= 25){
                System.out.println("Eligible for free regular shipping");
            }else{
                System.out.println("Shipping will cost $3.00");
            }
        }
    }
}
