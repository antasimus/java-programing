package day14_multi_branch_if_statement;
import java.util.Scanner;
public class DayActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of weather is outside?");
        String weather = scan.next();
        if (weather.equals("Sunny")){
            System.out.println("Lets go to park");
        }else if(weather.equals("Rainy")){
            System.out.println("Stay home and drink tea");
        }else if(weather.equals("Snowy")){
            System.out.println("Let's go out and make a snowman!");
        }else if(weather.equals("Windy")){
            System.out.println("Be rady for power lose!");
        }else {
            System.out.println("Wrong entry!");
        }
    }
}
