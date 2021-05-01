package day21_string_manipulation;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);
        word = word.replace("hub","lab");
        System.out.println("word = " + word);
        System.out.println(word.replace('i','o').replace('a','i'));

        String sentence = "Java is fun";
        String withNoSpace = sentence.replace(" ","");
        System.out.println("withNoSpace = " + withNoSpace);
        String replaceSentence = sentence.replace("Java","Selenium").replace("fun","a lot of fun");
        System.out.println("replaceSentence = " + replaceSentence);
        
        String result = "1-48 of over 4,000 results for \"Java book\"";
        result = result.replace("1-48 of over ","")
                .replace(",","").replace(" results for \"Java book\"","");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
        count++;
        if(count > 0) {
            System.out.println("Search success");
        }
    }
}
