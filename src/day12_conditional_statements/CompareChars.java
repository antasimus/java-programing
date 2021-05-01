package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1='A', letter2='J';
        System.out.println(letter1 == letter2);
        System.out.println(letter1 > letter2);
        System.out.println(letter1 < letter2);
        
        char grade = 'E';
        boolean pass = grade <= 'D';
        System.out.println("pass = " + pass);

        char grade2 = 'A';
        pass = grade2 <= 'D';
        System.out.println("pass = " + pass);
    }
}
