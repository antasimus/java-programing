package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(17); nums.add(11); nums.add(1983); nums.add(666);
        nums.add(500); nums.add(9); nums.add(1711); nums.add(69);
        nums.add(700); nums.add(0); nums.add(-17); nums.add(-5);

        System.out.println("nums = " + nums);
        nums.remove(8);
        System.out.println("nums = " + nums);
        // nums.remove(500); -> indef 500 -> IndexOutOfBoundsException
        nums.remove(new Integer(500)); // removes number 500, not an index 500!
        System.out.println("nums = " + nums);
        nums.remove(new Integer(9));
        System.out.println("nums = " + nums);

        //for loop - iterate through all values and print
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        //for each loop, and print all in same line
        for(int each : nums){
            System.out.print( each + " ");
        }
        System.out.println();
        for(Integer each : nums){
            System.out.print( each + "    ");
        }



    }
}
