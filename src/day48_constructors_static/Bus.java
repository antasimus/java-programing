package day48_constructors_static;

public class Bus {
    Driver driver;
    Engine engine;

    public String toString() {
        return driver.getName() +" | "+ engine.getCylinders();
    }
}
