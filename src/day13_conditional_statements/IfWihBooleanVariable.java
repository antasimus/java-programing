package day13_conditional_statements;

public class IfWihBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry){
            System.out.println("I am hungry, I will go get something to eat!");
            System.out.println("Than code JAVA.");
        }else{
            System.out.println("I am not hungry, I will keep coding Java!");
        }


        //new code
        double price = 1130.44;
        boolean isAffordable = 200 >= price;
        if(isAffordable){
            System.out.println("This item is affordable!");
        }else{
            System.out.println("This item is not affordable!");
        }
        System.out.println("");
        // new code
        boolean isRemoteJob = true;
        if(!isRemoteJob){
            System.out.println("Sorry I am not interested!");
        }else{
            System.out.println("Sure, I am interested, what is my next step!");
        }

        System.out.println("");
        // new

    }
}
