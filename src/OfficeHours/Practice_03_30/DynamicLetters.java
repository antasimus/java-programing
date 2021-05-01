package OfficeHours.Practice_03_30;
import java.util.Scanner;
public class DynamicLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chose uppercase or lowercase: ");
        String upperOrLower = scan.next();
        System.out.println("Chose ascending or descending:");
        String ascendingOrDescending = scan.next();
        int starting, ending;

        if (upperOrLower.equals("uppercase")){
            starting = 'A';
            ending = 'Z';
        }else{
            starting = 'a';
            ending = 'z';

        }
if(ascendingOrDescending.equals("ascending")) {

    for (int i = starting; i <= ending; i++) {
        System.out.print((char) i + " ");
    }
}else{
    for (int i = ending; i >= starting; i--) {
        System.out.print((char) i + " ");
    }
}
    }
}
