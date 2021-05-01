package OfficeHours.Homework;

public class PrintNumbOutOfString {
    public static void main(String[] args) {
        String result = "1-48 of over 4,000 results for Java book";
        result = result.replace("1-48 of over ","")
                .replace(",","")
                .replace(" results for Java book","");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
        System.out.println("count = " + count);
    }
}
