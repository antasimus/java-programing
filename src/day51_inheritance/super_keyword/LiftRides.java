package day51_inheritance.super_keyword;

public class LiftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL lyftXlRide = new LyftXL();
        Lux luxRide = new Lux();

        System.out.println("Lyft Ride for 5 miles = $" + lyftRide.calculateRate(5));
        System.out.println("LyftXL Ride for 5 miles = $" + lyftXlRide.calculateRate(5));
        System.out.println("Lux Ride for 5 miles = $" + luxRide.calculateRate(5));

    }
}
