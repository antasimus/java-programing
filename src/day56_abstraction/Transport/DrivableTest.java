package day56_abstraction.Transport;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.hi();
        model3.start();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(35);
        model3.stop();
        model3.bye();

        Plane cesta = new Plane();
        cesta.hi();
        cesta.start();
        cesta.takeOf();
        cesta.transportPeople();
        cesta.autoPiloting();
        cesta.cost(535);
        cesta.land();
        cesta.stop();
        cesta.bye();

        //Polymorphism: will learn on day 57

        SelfDrivable sd1 = new Plane();
        SelfDrivable sd2 = new Tesla();

        Transportation tp1 = new Plane();
        Transportation tp2 = new Tesla();
    }
}
