/*
Biggest substring of matching characters
Given a String find the biggest substring of chars that match
and print it.
Ex: aaabbbcccccddddeeOutput: ccccc
 */
package OfficeHours.Homework;
import java.util.Scanner;
public class BiggestSubstringOfMatchingCharacters3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start=0, end=0, max=1, current=1;
// start and end are used for a substring. max and current are to compare length
        System.out.println("Enter the String:");
        String string = scan.nextLine();
        for(int i=1; i < string.length(); i++){
//range is from 1 to the length, 1 less cycle because we compare current and previous Character
            if(string.charAt(i-1) == string.charAt(i)){ // comparison and previous and current character
                current++;  //if they are equal we increase current count for 1
                if(current>max){  // defying max length of substring
                    max=current;  //while current is larger then max, max will get a value of current
                    end=i; //end value will be used on the end as 2nd substring parameter.
                    start=i-current; //defying 1st substring parameter.
                } //else condition is not needed for current>max condition
            }else{
                current = 1; // if previous and current char are different we reset value current to start.
            }
        }
        System.out.println(string.substring(start+1,end+1));
    }
}
