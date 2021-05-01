package OfficeHours.Practice_04_13;
import java.util.*;
public class MultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] arrWords = words.split(", ");

        for(String eachWord : arrWords){
            if(eachWord.contains(" ")){
                System.out.println(eachWord);
            }
        }

        int [] arr = {3,1,2};

        for(int each : arr){

            switch (each){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
            }

        }

    }
}
