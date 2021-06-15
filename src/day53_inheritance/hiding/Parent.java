package day53_inheritance.hiding;

public class Parent {
    public String name = "parent > Mike Smith";
    public void introduce1(){
        System.out.println("Hello I am "+ name);
    }
}

class Child extends Parent{
    public String name = "child > Bob Smith";
    public void introduce2(){
        System.out.println("Hello I am "+name);
    }
}

class Runner{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.introduce1();
        Child child = new Child();
        child.introduce2();
        child.introduce1();
    }
}