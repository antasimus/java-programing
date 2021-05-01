package OfficeHours.Practice_03_30;

public class PrefixAgain {
    public static void main(String[] args) {
        String str = "abXYab";
        int n = 2;

        String prefix = str.substring(0,n);
        String remaining = str.substring(n);

        System.out.println(remaining.contains(prefix));
    }
}
