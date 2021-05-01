package OfficeHours.Practice_03_23;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 10, weeklyHours = 40, numberOfWeeks = 52;
        boolean hourlyRateIsValid = hourlyRate > 0;
        boolean weeklyHoursAreValid = weeklyHours > 0 && weeklyHours <= 65;
        boolean numberOfWeeksAreValid = numberOfWeeks > 0 && numberOfWeeks <= 52;

        if(hourlyRateIsValid){
            if(weeklyHoursAreValid){
                if(numberOfWeeksAreValid){
                    System.out.println("Salary is: " + (hourlyRate*weeklyHours*numberOfWeeks));
                }else{
                    System.out.println("Number of weeks can not be less than 1 or more than 52");
                }
            }else{
                System.out.println("Weekly hours can not be zero or more than 65!");
            }
        }else{
            System.out.println("Hourly rate can not be negative or zero!");
        }
    }
}
