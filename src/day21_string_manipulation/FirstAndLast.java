package day21_string_manipulation;

public class FirstAndLast {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0),
                last = word.charAt(2);

        if(first == last) {
            System.out.println("1st and last letters match.");
        }else{
            System.out.println("1st and last letter mismatch");
        }
        
        String word2="aziza";
        char first2=word.charAt(0), last2=word.charAt(word.length()-1);
        System.out.println(first2);
        System.out.println(last2);

        if (first2 == last2){
            System.out.println(word2 + "- first and last word match");
        }else{
            System.out.println(word2 + "- first and last word doesn't match");
        }

    }
}
