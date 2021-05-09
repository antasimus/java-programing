package day43_list_custom_classes;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");
        //removeIf method - java 8 -> accepts lambda - and easy to remove without loop
        dayNames.removeIf(d -> d.length() == 6);
        System.out.println("dayNames after removeIf = " + dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n>90);
        System.out.println("nums = " + nums);
        System.out.println("nums.size() = " + nums.size());
    }

    public static List<String> getDays() {
        //List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
        List<String> days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday"); days.add("Thursday");
        days.add("Friday"); days.add("Saturday"); days.add("Sunday");
        return days;
    }

    /**
     getRandomList
     param: int size
     return List<Integer>
     generate random numbers of size and assign to List then return
     getRandomList(3) ->
     getRandomList(2)
     */

    public static List<Integer> getRandomList(int size) {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(random.nextInt(101));
        }
        return nums;
    }

}
