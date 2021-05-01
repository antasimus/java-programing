package OfficeHours.Practice_04_19;
import day38_methods.StringUtils;
public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started snowing in Chicago"));
    }
    public static String reverseEachWord(String str){
        String reverse = "";
        for(String each : str.split(" ")){
            reverse += StringUtils.reverse(each) + " ";
        }
        return reverse.trim();
    }
}
