package day12_conditional_statements;

public class COmparisonExamples {
    public static void main(String[] args) {
        int speedLimit=55;
        int currentSpeed=45;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit<currentSpeed);
        System.out.println(speedLimit == currentSpeed);
        System.out.println(speedLimit != currentSpeed);
        System.out.println(speedLimit>currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        currentSpeed += 20;

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);


        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice));

        itemPrice += 200;
        boolean canAfford = accountBalance >+ itemPrice;
        System.out.println("canAfford = " + canAfford);
        
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <=0;
        System.out.println("isBroke = " + isBroke);
    }
}
