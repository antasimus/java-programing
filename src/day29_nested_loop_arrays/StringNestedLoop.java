package day29_nested_loop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "Java";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
