/*
Sample Book TextJava textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2 conditional statements. chapter 3 String manipulation. Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter 8 instance and static. Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more.
solution:
 */
package OfficeHours.Homework;

public class BookTextChapters {
    public static void main(String[] args) {
        String Book = "Sample Book TextJava textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2 conditional statements. chapter 3 String manipulation. Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter 8 instance and static. Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more.\n" +
                "solution:";
        int countChapter = 0;
        int length = Book.length(), i=0;

        //for (int i = 0 ; i < length - 6; i++){
            while (Book.substring(i , i +7).equalsIgnoreCase("chapter") || i< (length-7)) {
                countChapter ++ ;
                i++;
            }

        System.out.println("there is " +countChapter + " chapter");
        System.out.println("The value of the book is $" + (countChapter*10));
    }
}
