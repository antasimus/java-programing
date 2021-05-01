package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Boston";
        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to " + city);
        }else{
            System.out.println("Not considering to move to "+ city);
        }
    }
}
