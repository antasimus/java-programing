package OfficeHours.Practice_04_14;
import java.util.*;
public class LongestPalindrom {
    public static void main(String[] args) {
        String [] words = {"java", "longer word", "civic", "apple", "abcdefedcba", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        for(String word : words) {

            boolean isPalindrome = true;

            for(int i=0; i < word.length()/2; i++) {
                if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if(isPalindrome && word.length() > longestPalindrome.length()){
                longestPalindrome = word;
            }

        }

        System.out.println(longestPalindrome.isEmpty() ? "No palindrome" : longestPalindrome);
    }

}
