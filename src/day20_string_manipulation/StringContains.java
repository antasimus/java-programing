package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        System.out.println("ca e");

        if (company.contains(" ")){
            System.out.println("multiple words company name");
        }else{
            System.out.println("Single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains(" | ")){
            System.out.println("Pass - title check passed");
        }else{
            System.out.println("Fail - title check failed");
        }

        String firstName = "Misha";
        if(firstName.contains("a") && firstName.contains("i")){
            System.out.println("Name: "+ firstName + " contains letters A & I");
        }else{
            System.out.println("Name: " + firstName + " doesn't contains letter A & I ");
        }
        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println("Name: "+ firstName + " contains letter A or I");
        }else{
            System.out.println("Name: " + firstName + " doesn't contains letter A or I ");
        }

        String email = "ANTASIMUS@yahoo.com";
        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("email " + email +" is valid");
        }else {
            System.out.println("Invalid email");
        }

        if(email.toLowerCase().contains("m")){
            System.out.println("m is present");
        }else{
            System.out.println("m is not present");
        }
    }
}
