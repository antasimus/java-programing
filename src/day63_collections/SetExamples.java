package day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //list -> ArrayList
        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(100);

        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("hello");
        words.add("collections");

        System.out.println(words);

        //convert your Set to a list

        List<String> wordsList = new ArrayList<>(words);
        wordsList.add("world");
        System.out.println(wordsList);

        for(String word: words){

        }

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("24");
        linkedHashSet.add("java");
        linkedHashSet.add("$#");
        linkedHashSet.add("53");
        linkedHashSet.add("apple");
        linkedHashSet.add("53");
        linkedHashSet.add("java");
        linkedHashSet.add("cucumber");
        linkedHashSet.add("hello23");
        System.out.println(linkedHashSet);
        //linkedHashSet.get();


        Set<String> treeSet = new TreeSet<>();
        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("$#");
        treeSet.add("53");
        treeSet.add("apple");
        treeSet.add("53");
        treeSet.add("java");
        treeSet.add("cucumber");
        treeSet.add("hello23");
        System.out.println(treeSet);
        //((TreeSet)treeSet).first();
    }
}
