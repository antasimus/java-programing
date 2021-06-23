package day56_abstraction.Transport;

import day56_abstraction.Greet.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla cost $" +(mile*0.10)+ " to drive " + mile + " miles");
    }

    @Override
    public void hi() {
        System.out.println("hello hello peep peeep");
    }

    @Override
    public void bye() {
        System.out.println("bye bye charge me charge me");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving on automatic mode");
    }
}
