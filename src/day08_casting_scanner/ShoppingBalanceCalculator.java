package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55, price1 = 20.88, price2 = 89.99, price3 = 15, remainBall;
        int holeChange;
        System.out.println("My balance was $" + balance + ". After I bought shoes for $" + price2 + ", T-Shirt for $" + price1 + " and hat for $" + price3 + ", my remaining balance is $" + (balance-price1-price2-price3) + "!");
        remainBall = balance-price1-price2-price3;
        holeChange=(int)remainBall;
        System.out.println("My balance without change is: $" + holeChange);


    }
}
