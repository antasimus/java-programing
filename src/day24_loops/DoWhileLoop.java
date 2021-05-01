package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter=0;
        do{
            System.out.println("counter = " + counter);
            counter+=10;
        }while (counter <= 1000);
    }
}
