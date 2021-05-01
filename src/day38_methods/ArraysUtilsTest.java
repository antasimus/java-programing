package day38_methods;
import java.util.Arrays;

import static day38_methods.ArrayUtils.*;
public class ArraysUtilsTest {
    public static void main(String[] args) {
        int [] nums={11,17,23,32,-10,357};
        ArrayUtils.printArray(nums);
        System.out.println("sum = " + sum(nums));
        ArrayUtils.printArray(new int []{1,3,5,7,9,11, 17});
        System.out.println("3+5+7+9+11+17="+sum(new int[]{3,5,7,9,11,17}));

        int [] nums2 = {1,2,5,7,9,11};
        int num=8;
        System.out.println("is number " +num+ " part of the array:" + Arrays.toString(nums2) + "? Resulet is: " + contains(nums2, num));

    }
}
