package day54_abstraction;

public class Restaurant {
    public static void main(String[] args) {
        Pizza orderPizza = new Pizza();
        Salad orderSalad = new Salad();
        orderSalad.prepare();
        orderSalad.serve();
        orderPizza.prepare();
        orderPizza.serve();
    }
}
