package OfficeHours.Homework;
/*
Printing, variables, datatypes, concatenation
================================================

Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information
====================================================
 */
public class PersonInfo {
    public static void main(String[] args) {
        String name="Milos Antic", bday="Nov 17 1983", goute="Zivela deca nasih roditelja!";
        byte age=37;
        char gender='M';
        boolean student=false;
        short siblings=1;
        long favNum=17L;
        int numOfSeasons=22102, year=1983;
        double bDAY=11.17;

        System.out.println("Full name: \t\t\t"+ name+"\nDate of birth: \t\t"+bday);
        System.out.println("Age: \t\t\t\t"+age+"\nGender: \t\t\t"+gender+"\nStudent: \t\t\t"+student);
        System.out.println("Zip code: \t\t\t"+numOfSeasons+"\nSiblings: \t\t\t"+siblings+"\nFavorite number: \t"+favNum);
        System.out.println("Year of birth: \t\t"+year+"\nBirthday: \t\t\t"+bDAY);



    }
}
