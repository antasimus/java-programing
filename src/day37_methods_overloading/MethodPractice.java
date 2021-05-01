package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi", 3, '|'));
        System.out.println(repeatString("I can do it!", 10, '-'));
    }

    public static String repeatString(String word, int times, char delimiter) {
        String retValue = "";
        for(int i = 1; i <= times; i++) {
            //take care of last delimiter:
            if(i == times) { //if last iteration
                retValue += word; //add only word by itself
            } else {
                retValue += word + delimiter; //add with delimiter
            }
        }
        return retValue;

    }
}
