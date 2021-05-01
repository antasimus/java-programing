package day32_arrays_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
        String words = "java; python; selenium; html; c++";
        String[] wordsArray = words.split("; ");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);
        for (String word : wordsArray){
            System.out.println(word);
        }

        String sentence = "Jebem jebacu ko procita njega cu";
        String[] sentenceArray = sentence.split(" ");
        System.out.println("1st word: " + sentenceArray[0]);
        System.out.println("First word: " + sentence.split(" ")[0]);
        System.out.println("Number or words in sentence: " + sentenceArray.length);
    }
}
