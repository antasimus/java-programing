package day55_abstraction.Flag;

public class FlagDrawing {
    public static void main(String[] args) {
        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();
        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();
        UkrainianFlag ukrainianFlag = new UkrainianFlag();
        ukrainianFlag.draw();
    }
}
