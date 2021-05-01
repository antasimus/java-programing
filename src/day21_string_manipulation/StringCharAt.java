package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word+"-"+word.length());

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(1));
        char first = company.charAt(0);
        char second = company.charAt(1), third=company.charAt(2), forth=company.charAt(3), fifth=company.charAt(4);
        char sixth=company.charAt(5), seventh=company.charAt(6), eighth=company.charAt(7);
        System.out.println(first+" "+second+" "+third+" "+forth+" "+fifth+" "+sixth+" "+seventh+" "+eighth);
        String companyWithSpaces= first+" "+second+" "+third+" "+forth+" "+fifth+" "+sixth+" "+seventh+" "+eighth;
        System.out.println("companyWithSpaces = " + companyWithSpaces);


    }
}
