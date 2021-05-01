package day19_class_vs_object_strings;
import java.util.Scanner;
public class StringStartsEndsWith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.nextLine();

        System.out.println(word.startsWith("i"));//true
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        /**
         * Safura Taghiyeva — Today at 4:25 PM
         * <@!767133106318213170> What if we put the whole word for startsWith and endsWith?
         */
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.startsWith("Int")); //false. case sensitive

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Irina";
        if(name.endsWith("a")) {
            System.out.println("Maybe, it is a female name");
        }

        /**
         * Mr. -> Man
         * Dr. -> Doctor
         * Mrs.-> Married woman
         * Ms. -> Single woman
         * Sr. -> Senior
         */

        String firstName = "Dr. Nadir";
        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        }else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        }else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        }else if (firstName.startsWith("Ms.")) {
            System.out.println("Single woman");
        }else if (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        }else{
            System.out.println("Normal name");
        }

        /**
         * String url = "https://www.stackoverflow.com"
         * .com -> "Commercial website"
         * .ru -> "Russian website"
         * .gov -> "Government website
         * .edu -> "Education website
         * .org -> "Organization website
         */
        String url = "https://charitywater.org";
        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        }else if (url.endsWith(".ru")) {
            System.out.println("Russian website");
        }else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        }else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        }else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        }
    }
}
