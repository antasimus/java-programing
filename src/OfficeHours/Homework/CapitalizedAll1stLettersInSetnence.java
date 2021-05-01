package OfficeHours.Homework;

public class CapitalizedAll1stLettersInSetnence {
    public static void main(String[] args) {
        String text = "lOs ANGeles, kaIRO, belgrade, iStAnBul", capitalizedWords="";
        int emptySpace = text.indexOf(" ");
        System.out.println(text);
        while (emptySpace != -1 ) {
            capitalizedWords = capitalizedWords + (text.substring(0,1).toUpperCase() + text.substring(1, emptySpace).toLowerCase() + " ");
            text = text.substring(emptySpace+1);
            emptySpace = text.indexOf(" ");
        }
        capitalizedWords = capitalizedWords + (text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase() + " ");
        System.out.println(capitalizedWords);

    }
}
