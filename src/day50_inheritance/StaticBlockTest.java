package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo();
        StaticBlockDemo st2 = new StaticBlockDemo();
        StaticBlockDemo st3 = new StaticBlockDemo();
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num); //75
    }
}
