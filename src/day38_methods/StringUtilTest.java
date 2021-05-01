package day38_methods;
import static day38_methods.StringUtils.*;
public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username can not be null or nothing");
        }

        System.out.println("isPalindrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(Kayak) = " + StringUtils.isPalindrome("Kayak"));
        System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek"));
        System.out.println("Inverse text (Java is fun) - " + reverse("Java is fun"));

        String text= " Jebo ti pas mater";
        String inverseText= StringUtils.reverse(text);
        System.out.println("Text: " +text+ " - reversed: "+ inverseText);

    }
}
