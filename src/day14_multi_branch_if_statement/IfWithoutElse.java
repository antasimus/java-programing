package day14_multi_branch_if_statement;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2020;
        if (year == 2020){
            System.out.println(year + " is Covid19 year!");
            System.out.println("Wear masks and keep distance!");
        }
        System.out.println("Keep coding Java");
        System.out.println();
        //new code
        String country = "Canada";
        if (country.equals("USA")){
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pennsylvania Ave ");
        }
        System.out.println("Welcome to " + country);
    }

}
