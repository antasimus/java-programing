package day37_methods_overloading;
import java.util.*;
public class DaySelector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the day in the week");
        int day=scan.nextInt();
        System.out.println(getDayName(day));

        for (int i = 0; i < 9; i++) {
            System.out.println(i +" = "+ getDayName(i));
        }

        //Store getDayName into variable, and print variable
        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if(someDay == null) {
            System.out.println("someDay is null for invalid day");
        }

        System.out.println(getDayNameV2(2));
    }
    public static String getDayName(int dayNumber){
        switch (dayNumber){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("Invalid day number - " + dayNumber);
                return null;
        }
    }
    public static String getDayNameV2(int day) {
        String dayName;
        switch(day) {
            case 1: dayName = "Monday"; break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - " + day);
                dayName = null;
        }
        return dayName;
    }
}
