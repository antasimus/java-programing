package day53_inheritance.tesla;

public class Roadster extends ElectricCar{

    public Roadster(String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
        System.out.println("Welcome new Roadster!");
    }
}
