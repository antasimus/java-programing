package OfficeHours.Practice_03_22;

public class ArmyQualification {
    public static void main(String[] args) {
        String citizenship = "USA";
        boolean resident = true;
        if(citizenship.equalsIgnoreCase("USA") || resident){
            int age = 18;
            if(age>=18 && age<=35){
                boolean hasDiploma = true;
                if(hasDiploma){
                    System.out.println("You are qualified for the US Army");
                }else{
                    System.out.println("Must have High school diploma");
                }
            }else{
                System.out.println("Your age must be between 18 and 35");
            }
        }else{
            System.out.println("You must be a U.S citizen or a resident");
        }
    }
}
