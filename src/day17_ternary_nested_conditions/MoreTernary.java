package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 35;
        /*
        String reply;
        if(hourlyRate > 45){
            System.out.println("Accept);
        }else{
            System.out.println("Reject);
        }

         */

        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Saim|Murodil" : "Nadir";
        System.out.println("Today's teacher is" + teacher);
        
        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "Have DL, can drive" : "No DL, cannot drive";
        System.out.println(driving);



    }
}
