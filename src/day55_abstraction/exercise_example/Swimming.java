package day55_abstraction.exercise_example;

public class Swimming extends Exercise {
    @Override
    public void perform() {
        System.out.println("Performing swimming in a pool or ocean");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*11;
    }
}
