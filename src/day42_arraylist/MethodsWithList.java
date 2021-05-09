package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        //declare string array list and add values
        List<String> words = new ArrayList<>();
        words.add("java");words.add("html");words.add("selenium");words.add("a");words.add("inout");
        words.add("title");
        //pass the words list to printStrList Method
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));
    }


    public static void printStrList(List<String> stringList){
        for(String str : stringList){
            System.out.print(str + " ");
        }
        System.out.println();
    }
/*
Method : sumIntegerList
param: List of integers
return int
calculates sum of integers in the list then returns
 */



}
