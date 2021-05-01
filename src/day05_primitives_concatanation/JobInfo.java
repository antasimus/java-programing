package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Palo Alto Networks";
        String jobDescription = "Programing in Java, Selenium, Cucumber, JUnit";
        double salary = 125000;
        byte yearsExp = 3;
        boolean hasBenefits = true;

        System.out.println("Job title: \t\t\t\t" + title);
        System.out.println("Company: \t\t\t\t" + company);
        System.out.println("Job Description: \t\t" + jobDescription);
        System.out.println("Yearly salary: \t\t\t$" + salary);
        System.out.println("Years of Experience: \t" + yearsExp);
        System.out.println("Has benefits: \t\t\t" + hasBenefits);
    }
}
