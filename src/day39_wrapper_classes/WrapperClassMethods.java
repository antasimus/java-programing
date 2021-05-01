package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println("MAX INT: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4, 23.9));
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1)); // 1 output, 1st number larger than 2nd
        System.out.println(Double.compare(5,5)); // 0 output, both number equals
        System.out.println(Double.compare(1,5)); // -1 output, 1st number smaller than 2nd

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('9'));
        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("It is uppercase");
        }
        String word = "JvVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i))){
                System.out.println(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
    }
}
