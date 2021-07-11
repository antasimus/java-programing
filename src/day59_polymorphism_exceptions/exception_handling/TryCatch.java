package day59_polymorphism_exceptions.exception_handling;

public class TryCatch {
    public static void main(String[] args) {
        try{
            System.out.println(10 / 2);
            System.out.println(10 / 0);
            System.out.println(10 / 3); //skipped
        }catch(Exception e){
            System.out.println("RuntimeException happened and handled");
        }
        System.out.println("After first try catch");

        int[] nums = {11,33,44};
        try{
            System.out.println(nums[0]);
            System.out.println(nums[3]);
            System.out.println(nums[1]);//skipped
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException is caught and handled");
        }
        System.out.println("After array code");
    }
}
