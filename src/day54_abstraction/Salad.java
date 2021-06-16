package day54_abstraction;

public class Salad extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("chop veggies, add dressing");
    }

    @Override
    public void serve() {
        System.out.println("Put into bowl, and serve with forks");
    }
}
