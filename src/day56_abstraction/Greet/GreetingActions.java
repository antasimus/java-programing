package day56_abstraction.Greet;

public class GreetingActions {
    public static void main(String[] args) {

        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();

        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();

        Greeting sr = new SerbianLanguage();
        sr.hi();
        sr.bye();

        Japanese jp = new Japanese();
        jp.hi();
        jp.bye();

        gt = new Japanese();
        gt.hi();
        gt.bye();

    }
}
