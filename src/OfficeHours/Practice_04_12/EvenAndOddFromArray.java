package OfficeHours.Practice_04_12;
import java.util.*;
public class EvenAndOddFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int nums[] = {4,1,3,12,5};
        System.out.println("How many numbers do you have?");
        int [] nums = new int[scan.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number "+(i+1)+":");
            nums[i]= scan.nextInt();
        }

        int even = 0, odd = 0;

        for(int eachNum : nums){
            if(eachNum % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        int [] evenNumbers = new int[even];
        int [] oddNumbers = new int[odd];

        for(int i = 0, e=0, o=0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evenNumbers[e++]=nums[i];
            }else{
                oddNumbers[o++]=nums[i];
            }
        }
        System.out.print("Even numbers: " + Arrays.toString(evenNumbers) + "\n");
        System.out.print("Odd numbers: " + Arrays.toString(oddNumbers) + "\n");


    }
}
