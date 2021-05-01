package OfficeHours.Practice_04_12;
import java.util.*;
public class MinNadMaxFromArray {
    public static void main(String[] args) {
        int [] arr = {3,1,500,-3,-10,4,3};
        int min = arr[0];
        int max = arr[0];

        for(int each :arr) {
            // each -> every element | for loop: arr[i]

            if(each < min) {
                min = each;
            }

            if(each > max) {
                max = each;
            }

        }

        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);

        // ------------------------

        int [] arr2 = {4,2,505,-13,-110,4,17};
        int min2 = arr2[0];
        int max2 = arr2[0];

        for(int i =0; i < arr2.length; i++) {
            // each -> every element | for loop: arr[i]

            if(arr2[i] < min2) {
                min2 = arr2[i];
            }

            if(arr2[i] > max2) {
                max2 = arr2[i];
            }

        }

        System.out.println("MIN: " + min2);
        System.out.println("MAX: " + max2);
    }
}
