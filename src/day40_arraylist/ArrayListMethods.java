package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List not empty, code java than goto mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("tesla");
        shoppingList.add("laptop");
        shoppingList.add("iPhone");
        shoppingList.add("Java book");
        shoppingList.add("T-shirt");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List not empty, code java than goto mall");
        }
        System.out.println(shoppingList);

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is laptop in my list? " + shoppingList.contains("laptop"));


    }
}
