package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("-- Etsy search smoke test completed - PASSED --");

    }
    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigate to www.Etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("PASS: Verify 'Wooden spoon' search is displayed");
    }
}
