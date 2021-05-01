package day32_arrays_split;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 650.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        double maxPrice = prices[0], minPrice = prices[0];
        int indexOfMaxPrice = 0, indexOfMinPrice = 0;

        for (int i = 1; i < (items.length) ; i++) {
            if (maxPrice < prices[i]){
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
            if (minPrice > prices[i]){
                minPrice = prices[i];
                indexOfMinPrice = i;
            }

        }
        System.out.println("The most expensive item is: " + items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #" + itemIDs[indexOfMaxPrice]);
        System.out.println("The cheapest item is: " + items[indexOfMinPrice] + " - $" + prices[indexOfMinPrice] + " - #" + itemIDs[indexOfMinPrice]);
    }
}
