package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "today is java array class", inverseString="";
        String[] sentenceArray = sentence.split(" ");
        for (int i = sentenceArray.length -1; i >= 0; i--) {
            inverseString += sentenceArray[i] + " ";
        }
        System.out.println(inverseString);
    }
}
