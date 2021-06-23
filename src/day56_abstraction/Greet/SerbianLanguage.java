package day56_abstraction.Greet;

public class SerbianLanguage implements Greeting{
    @Override
    public void hi() {
        System.out.println("Zdravo");
    }

    @Override
    public void bye() {
        System.out.println("Cao");
    }
}
