package day31st_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 123, 654, 2344, 12345, 14421, 654};
        System.out.println(Arrays.binarySearch(nums, 23));
        System.out.println(Arrays.binarySearch(nums, 2344));
        System.out.println(Arrays.binarySearch(nums, 654));
        System.out.println(Arrays.binarySearch(nums, 25));

        if(Arrays.binarySearch(nums, 12345)>0){
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present");
        }

    }
}
