package day56_abstraction.Transport;

import day56_abstraction.Greet.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void hi() {
        System.out.println("Welcome aboard, enjoy the flight");
    }

    @Override
    public void bye() {
        System.out.println("Thank you for flying with us, have a nice rest of the day");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Plane is flying in auto-pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("Plane is transporting people in the air");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost $" +(mile*7.5)+ " to drive " + mile + " miles");
    }

    public void land() {
        System.out.println("Plane landed safely");
    }

    public void takeOf() {
        System.out.println("Plane is taking off, fasten your seat belts!");
    }
}
