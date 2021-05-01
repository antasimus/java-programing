package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){


        String carModel = "Jeep WRANGLER";
        String driverName = "Misha Antic";
        String licenseNum = "C625870";
        char licenseClass = 68;
        short speed = 125;
        boolean automatic = true;

        System.out.println("Vehicle model: \t\t\t" + carModel);
        System.out.println("Driver's name: \t\t\t" + driverName);
        System.out.println("Driver's license #: \t" + licenseNum);
        System.out.println("DL class: \t\t\t\t" + licenseClass);
        System.out.println("Maximum Speed \t\t\t" + speed + "Mph");
        System.out.println("Transmission automatic: " + automatic);

        System.out.println(driverName + " is driving a " + carModel + " with his active DL#" + licenseNum + " class: " + licenseClass + ". Max car speed is: " + speed + "Mph." );
        System.out.println(10+5);
    }
}
