package day10_shorthand_operators;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //How is the weather today?
        //enter answer: cold, war, nice, rainy...
        System.out.println("How is the weather today?");
        String weather = scan.next();
        System.out.println("It is "+weather+". I like when is "+weather);
        scan.nextLine();
        System.out.println("Can you describe more the weather?");
        String weather2 = scan.nextLine();
        System.out.println(weather2);


    }

}
