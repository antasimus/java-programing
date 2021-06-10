package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55.0) = "+developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(55.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));
        
        Contractor sDetContractor = new Contractor();
        sDetContractor.jobTitle = "SDET";
        double sDetSalary = sDetContractor.calculateSalary(55);
        System.out.println("sDetSalary = " + sDetSalary);

        System.out.println(developer.toString());
        System.out.println(sDetContractor);
    }
}
