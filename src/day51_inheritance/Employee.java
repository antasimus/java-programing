package day51_inheritance;

public class Employee {
    String jobTitle;
    //toString method is inherited from Object class
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public double calculateSalary(double hourlyRate){
        return 52*40*hourlyRate*1.1;
    }
}
