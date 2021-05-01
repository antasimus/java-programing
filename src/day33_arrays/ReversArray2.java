package day33_arrays;
import java.util.Arrays;
public class ReversArray2 {
    public static void main(String[] args) {
        int[] nums = {5,10,4,100}; int temp;
        System.out.println("Before swap: " + Arrays.toString(nums));
        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;

        int[] nums2 = { 5, 10, 4, 100, 17, 13};
        System.out.println("Before swap: " + Arrays.toString(nums2));
        for (int i = 0; i < nums2.length/2; i++) {
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length-1-i];
            nums2[nums2.length-1-i]=temp2;
        }
        System.out.println("After swap: " + Arrays.toString(nums2));


        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));
        System.out.println("Before swap: " + Arrays.toString(words));

        for (int j = 0; j < words.length/2; j++) {
            String tempWord = words[j];
            words[j]=words[words.length-1-j];
            words[words.length-1-j]=tempWord;
        }
        System.out.println("After swap: " + Arrays.toString(words));


        String[] words2 = {"java", "html", "js", "ruby", "css", "pascal", "python", "c#"};
        System.out.println("Before swap: " + Arrays.toString(words2));
        for (int j = 0, k=words2.length-1; j < words2.length/2; j++, k--) {
            String tempWord = words2[j];
            words2[j]=words2[k];
            words2[k]=tempWord;
        }
        System.out.println("After swap: " + Arrays.toString(words2));
    }
}
