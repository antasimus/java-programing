package day43_list_custom_classes;
import java.util.*;
public class MethodsWithListReturn {
    /**
     * get IntegerList
     * No params
     * return List<Integer>
     *     Loop from 0 - 1000_000
     *     and add to arraylist then return it
     */
    public static void main(String[] args) {
        long start = System.nanoTime();
        List<Integer> mlnNums = getIntegerList(); //returns ready ArrayList object. no need new Array..
        long end = System.nanoTime();
        double listSeconds = (end-start)/1000000000.0;
        System.out.println("ArrayList time = \t\t" + (end - start) + "nS");
        System.out.println("Array List seconds = \t" + listSeconds);

        long st = System.nanoTime();
        int[] arr = getIntegerArray();
        long en = System.nanoTime();
        double seconds = (en-st)/1000000000.0;
        System.out.println("Array time = \t\t\t" + (en-st) + "nS");
        System.out.println("Array seconds = \t\t"+ seconds);
    }
    public static List<Integer> getIntegerList() {
        List<Integer> nums =  new ArrayList<>();
        for (int i = 0; i <= 1000000 ; i++) {
            nums.add(i);
        }
        return nums;
    }

    /**
     * getIntegerArray
     * No params
     * return int[]
     *    Loop from 0 - 1000_000
     *    and add to int[] then return it
     */
    public static int[] getIntegerArray() {
        int[] nums = new int[1_000_001];
        for (int i = 0; i <1_000_000 ; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
