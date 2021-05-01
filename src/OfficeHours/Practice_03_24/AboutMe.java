package OfficeHours.Practice_03_24;

public class AboutMe {
    public static void main(String[] args) {
        String s="java";
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('m'));

        System.out.println(s.contains("j"));
        System.out.println(s.indexOf('j') >= 0 ? "Contains": "Not contains");
        System.out.println(s.indexOf('g') >= 0 ? "Contains": "Not contains");

        System.out.println(s.toLowerCase().contains("a"));
        System.out.println(s.toLowerCase().startsWith("a"));
        // boolean.String method
        System.out.println(s.toLowerCase().replace("j", "e").startsWith("a"));
    }
}
