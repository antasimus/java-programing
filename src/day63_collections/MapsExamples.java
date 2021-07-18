package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"James");
        map.put(2,"Misha");
        map.put(3,"Anna");
        map.put(3, "Daria");
        map.put(100, "Maxim");
        map.put(101, "Maxim");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.get(100));
        System.out.println(map.get(50));

        map.remove(1);
        System.out.println(map);
        map.put(1, "Kinga");
        System.out.println(map);
        map.remove("Maxim");
        System.out.println(map);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Maxim"));

        for(Integer key : map.keySet()){
            System.out.println(key+" - "+map.get(key));
            if(map.get(key).equals("Daria")){
                System.out.println("This is our key " + key);
            }
        }

    }
}
