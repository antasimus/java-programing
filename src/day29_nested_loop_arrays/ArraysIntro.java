package day29_nested_loop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10;
        int[] nums = new int[3];
        nums[0]=5;
        nums[1]=10;
        nums[2]=15;

        System.out.println("value a index 0 = " + nums[0]);
        System.out.println("value a index 1 = " + nums[1]);
        System.out.println("value a index 2 = " + nums[2]);
        // System.out.println("nums = " + nums); - not an option

        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]); //10

        //how to find out the size of the array.
        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable
    }
}
