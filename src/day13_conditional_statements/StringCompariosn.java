package day13_conditional_statements;

public class StringCompariosn {
    public static void main(String[] args) {
        String city = "Fairfax";
        if(city == "Fairfax"){
            System.out.println("It is Fairfax");
        }else{
            System.out.println("It is not Fairfax");
        }

        // more reliable option!

        System.out.println("");
        String city1="Los Angeles";
        if(city1.equals("Los Angeles")){
            System.out.println("It is LA");
        }else{
            System.out.println("It is not LA");
        }
    }
}
