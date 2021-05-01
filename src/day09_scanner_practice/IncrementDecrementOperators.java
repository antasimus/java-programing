package day09_scanner_practice;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i=1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);
        --i;
        System.out.println("i = " + i);
        i--;
        System.out.println("i = " + i);
        
        
        char letter='a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);

        String S="A";
        System.out.println("S = " + S);
        S=S+1;
        //S++; ne radi za string
        System.out.println("S = " + S);
    }
}
