package day29_nested_loop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outer = 0; outer <= 10; outer++) {
            for (int inner = 0; inner <= 10; inner++) {
                System.out.print(outer * inner + "\t ");
            }
            System.out.println();
        }

    }
}
