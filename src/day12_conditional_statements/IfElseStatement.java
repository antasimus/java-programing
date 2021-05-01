package day12_conditional_statements;

public class IfElseStatement {
    public static void main(String[] args) {
        if (10>5) {
            System.out.println("Condition is TRUE");
        }
        else {
            System.out.println("Condition is FALSE");
        }


    int count = 25;
        if (count>30) {
            System.out.println("Condition is TRUE");
        }
        else {
            System.out.println("Condition is FALSE");
        }

        byte age = 14;
        if(age >= 18) {
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }
    }
}
