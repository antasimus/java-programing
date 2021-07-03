package day58_polymorphism;

public class Superman extends Father implements Worker{


    @Override
    public void work(String job) {
        System.out.println("Supermen is working as "+ job);
    }

    @Override
    public double getPaid() {
        System.out.println("Supermen is getting paid");
        return 80000;
    }
}
