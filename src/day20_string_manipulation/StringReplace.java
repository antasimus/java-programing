package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String word = "Java is fun to program, and I love to study Java!";
        System.out.println(word);
        System.out.println(word.replace("a","U"));
        System.out.println(word.replace("o","E"));
        System.out.println(word);
        System.out.println(word.replace("Java",""));
    }
}
