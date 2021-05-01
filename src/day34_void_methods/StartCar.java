package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }
    public static void pressGasPedal(){
        System.out.println("4. Hold steering wheel and press the gas pedal.");
    }
    public static void seatInCar(){
        System.out.println("1. Open the door and seat in the driver's seat.");
    }
    public static void startTheCar(){
        System.out.println("2. Insert the key to ignition and turn clockwise.");
    }
    public static void shiftToDrive(){
        System.out.println("3. Press brake pedal and shift to the Drive mode.");
    }

}
