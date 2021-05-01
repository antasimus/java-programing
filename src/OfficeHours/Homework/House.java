package OfficeHours.Homework;
/*
1) Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?,
        is there an attic, is there a pool, is the house for sale?,
        cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */
public class House {
    public static void main(String[] args) {
        String houseType = "Townhouse", address="1950 Magarity Rd, McLean VA";
        byte numRooms=4, numBaths=3, numKitchen=1, schoolRate=9;
        boolean basement=true, attic=false, pool=false, forSale=true, park=true;
        int zip=22102, price=850000;

        System.out.println("Real Estate listing:");
        System.out.println("Active: \t\t\t\t"+forSale);
        System.out.println("Listed price: \t\t\t"+price);
        System.out.println("Location: \t\t\t\t" + address + ", Zip " +zip);
        System.out.println("Property type: \t\t\t" + houseType);
        System.out.println("Property details: \nNumber of rooms: \t\t" + numRooms + "\nNumber of bathrooms: \t" + numBaths + "\nNumber of kitchens: \t"+ numKitchen);
        System.out.println("Has a basement: \t\t"+basement+"\nHas attic: \t\t\t\t"+attic+"\nHas pool: \t\t\t\t"+pool+"\nPark near by: \t\t\t"+park);
        System.out.println("School rating: \t\t\t"+schoolRate+"/10");

    }
}
