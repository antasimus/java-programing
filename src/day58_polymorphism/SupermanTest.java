package day58_polymorphism;

public class SupermanTest {
    public static void main(String[] args) {
        Father spMan1 = new Superman();
        spMan1.playWithKid();
        spMan1.feedKid();
        spMan1.raiseKid();
        //spMan1.work("SDET"); It will not work. sMan1 can only access Father's methods!
        Worker spMan2 = new Superman();
        spMan2.work("SDET");
        System.out.println("Got paid $" + spMan2.getPaid());
        //spMan2.raiseKid(); It will not work. spMan2 can only access Worker's methods!
        Superman spMan3 = new Superman();
        spMan3.playWithKid();
        spMan3.feedKid();
        spMan3.raiseKid();
        spMan3.work("Porn Star");
        System.out.println("spMan3 is paid $" + spMan3.getPaid());
    }
}
