package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Honolulu";
        double salary = 120_000.0;
        boolean rrr = true;
        boolean benefits = true;
        if(location.equals("Honolulu") && salary >=120_000.0 && rrr && benefits){
            System.out.println("Sure, I'll accept this offer");
        }else{
            System.out.println("Lets consider another offer");
        }
    }
}
