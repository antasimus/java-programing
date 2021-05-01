package day19_class_vs_object_strings;

public class StringCOmparison {
    public static void main(String[] args) {
        String city = "Chicago";
        // Equals() method - CASE SENSITIVE COMPARISON
        System.out.println(city.equals("Chicago"));
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("Chicago "));
        //EQUALSIGNORECASE() methods - Case INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("Chicago"));
        System.out.println(city.equalsIgnoreCase("CHICAGO"));
        System.out.println(city.equalsIgnoreCase("ChiCagO"));
        System.out.println(city.equalsIgnoreCase("Chiicago"));
        System.out.println(city.equalsIgnoreCase("Chicago "));


        if (city.equals("CHICAGO")){
            System.out.println("equals () true");
        }else{
            System.out.println("equals () false");
        }

        if (city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equals Ignore () true");
        }else {
            System.out.println("equals Ignore () false");
        }
    }
}
