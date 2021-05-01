package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars=10;
        System.out.println("cars = " + cars);
        cars += 2;
        System.out.println("cars = " + cars);
        cars+=5;
        System.out.println("cars = " + cars);
        cars-=6;
        System.out.println("cars = " + cars);
        cars-=1;
        System.out.println("cars = " + cars);

        int electricCars = 13;
        cars+=electricCars;
        System.out.println("cars = " + cars);
        
        String word="Java";
        System.out.println("word = " + word);
        word+=" programing is fun";
        System.out.println("word = " + word);
        String selenium=" but \'selenium\" is more fun.";
        word+=selenium;
        System.out.println("word = " + word);
        word+=12345;
        System.out.println("word = " + word);
        
        char letter='A';
        System.out.println("letter = " + letter);
        letter+=3;
        System.out.println("letter = " + letter);
        letter+='j';
        System.out.println("letter = " + letter);

    }
}
