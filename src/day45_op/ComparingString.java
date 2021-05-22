package day45_op;

public class ComparingString {
    public static void main(String[] args) {
        String word1 = "java"; //create in string pool
        String word2 = "java"; //re-use from string pool
        String word3 = new String("java"); //create NEW object in HEAP, outside String pool
        String word4 = new String("java"); //create NEW object in HEAP, outside String pool

        System.out.println(word1 == word2); //TRUE -  point to same object in pool
        System.out.println(word1 == word3); //FALSE -> point to different object in HEAP and POOL
        System.out.println(word3 == word4); // FALSE -> point to different objects in HEAP
        System.gc();
        System.out.println(word1.equals(word2)); // TRUE - comparing values
        System.out.println(word1.equals(word3)); // TRUE - comparing values
        System.out.println(word3.equals(word4)); // TRUE - comparing values


    }
}
