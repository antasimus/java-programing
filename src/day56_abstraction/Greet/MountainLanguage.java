package day56_abstraction.Greet;

public class MountainLanguage implements Greeting{

    @Override
    public void hi() {
        System.out.println("Zeee");
    }

    @Override
    public void bye() {
        System.out.println("Buaaa");
    }
}
