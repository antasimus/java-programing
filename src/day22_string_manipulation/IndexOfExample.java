package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index "+ indexOfJava);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("Cucumber is at index " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql"); //not present -1
        System.out.println("sql is at index " + indexOfSql);

        //technologies contains "maven" ?
        if(technologies.contains("maven")) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
        //"java, html, css, selenium, testng, maven, cucumber"
        if(technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
    }
}
