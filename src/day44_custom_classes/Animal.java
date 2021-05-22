package day44_custom_classes;

public class Animal {
    String type = "some animal";

    public void eat() {
        System.out.println("eating");
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }
    public void speak(){
        System.out.println("speaking");
    }
}