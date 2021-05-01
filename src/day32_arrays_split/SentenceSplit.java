package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String words = "Java is fun";
        String[] wrodsArray = words.split(" ");
        for (String w : wrodsArray){
            System.out.println(w);
        }



        String googleResults = "About 1,810,000 results (0.68 seconds)";
        String[] results =  googleResults.split(" ");
        System.out.println("Count = " + results[1]);
        System.out.println("Seconds = " + results[3].replace("(","") );
        System.out.println("Seconds : " + results[3].substring(1));

    }
}
