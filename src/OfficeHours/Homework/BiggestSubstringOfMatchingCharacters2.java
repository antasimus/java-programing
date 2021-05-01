package OfficeHours.Homework;
import java.util.Scanner;
public class BiggestSubstringOfMatchingCharacters2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();

        String max = "";
        String x = text.substring(0, 1);

        for (int i = 1; i <= text.length(); i++) {
            if (i < text.length() && x.charAt(x.length() - 1) == text.charAt(i)) {
                x += text.charAt(i);
            } else {
                if (x.length() > max.length())
                    max = x;
                if (i < text.length())
                    x = text.substring(i, i + 1);
            }
        }
        System.out.println("max = " + max);

    }
}
