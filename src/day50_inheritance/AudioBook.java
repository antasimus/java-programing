package day50_inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public void listen(){
        System.out.println("Listening the AudioBook");
        System.out.println("title = ");
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("narrator = " + narrator);
        System.out.println("length = " + length);
    }
}
