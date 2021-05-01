package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 7;
        if (!(age > 7)) {
            System.out.println("Need to seat in the car seat. Age is " + age);
        } else {
            System.out.println("Can sit normal seat. Age is " + age);
        }

        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit");
        }
        boolean isAffordable = true;
        if (!isAffordable){
            System.out.println("Item is not affordable");
        }

        String carModel = "Tesla";
        if(!carModel.equals("Tesla")){
            System.out.println("Not interested!");
        }
        String secretPass="abc123", inputPass="abc321";
        if(!inputPass.equals(secretPass)){
            System.out.println("Incorrect Password!");
        }
    }
}
